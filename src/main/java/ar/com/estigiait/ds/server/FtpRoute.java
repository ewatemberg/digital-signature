package ar.com.estigiait.ds.server;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;

import ar.com.estigiait.ds.signature.XadesBesSignature;

/**
 * Ftp route permite poolear un ftp {@code ftp.origin},
 * transformar el contenido de este archivo agregando
 * su firma digital y guardarlo en otro ftp {@code ftp.destiny}  
 * 
 */
public class FtpRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // configure properties component
        PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
        pc.setLocation("classpath:ftp.properties");
        
//        PropertiesComponent pcds = getContext().getComponent("properties", PropertiesComponent.class);
//        pcds.setLocation("conf-signature.properties");

        // lets shutdown faster in case of in-flight messages stack up
        getContext().getShutdownStrategy().setTimeout(10);

        from("{{ftp.origin}}&delay=5000s")
        	.process(new SignatureProcessor())
            .to("{{ftp.destiny}}")
            .log("Sign file ${file:name} complete.");

        // use system out so it stand out
        System.out.println("*********************************************************************************");
        System.out.println("Este proceso rutea archivos desde el servidor FTP: "
                + getContext().resolvePropertyPlaceholders("{{ftp.origin}}") + " al sevidor FTP: " + getContext().resolvePropertyPlaceholders("{{ftp.destiny}}"));
        System.out.println("Usted puede configurar la locacion del ftp server desde el archivo src/main/resources/ftp.properties.");
        System.out.println("*********************************************************************************");
    }
    
    
    /**
     * Proceso que permite transformar el contenido 
     * del archivo pooleado, agregando su firma
     * digital.
     *
     */
    private static final class SignatureProcessor implements Processor {
        public void process(Exchange exchange) throws Exception {
            String body = exchange.getIn().getBody(String.class);
            exchange.getOut().setHeader("CamelFileName", exchange.getIn().getHeader("CamelFileName") );
            exchange.getOut().setBody(XadesBesSignature.firmar(body,FtpRoute.class.getResource("/usr0061.p12").getPath(), "usr0061"));
        }
    }
}