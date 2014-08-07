package ar.com.estigiait.ds.server;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.properties.PropertiesComponent;

import ar.com.estigiait.ds.server.model.IncrementRequest;
import ar.com.estigiait.ds.server.model.IncrementResponse;

/**
 * Server route
 */
public class FtpRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // configure properties component
        PropertiesComponent pc = getContext().getComponent("properties", PropertiesComponent.class);
        pc.setLocation("classpath:ftp.properties");

        // lets shutdown faster in case of in-flight messages stack up
        getContext().getShutdownStrategy().setTimeout(10);

        from("{{ftp.origin}}&delay=5000s")
        	.process(new SignatureProcessor())
            .to("{{ftp.destiny}}")
            .log("Sign file ${file:name} complete.");

        // use system out so it stand out
        System.out.println("*********************************************************************************");
        System.out.println("This app will route files from the FTP server: "
                + getContext().resolvePropertyPlaceholders("{{ftp.origin}}") + " to FTP server: " + getContext().resolvePropertyPlaceholders("{{ftp.origin}}"));
        System.out.println("You can configure the location of the ftp server in the src/main/resources/ftp.properties file.");
        System.out.println("*********************************************************************************");
    }
    
    
    /**
     * 
     *
     */
    private static final class SignatureProcessor implements Processor {
        public void process(Exchange exchange) throws Exception {
            String body = exchange.getIn().getBody(String.class);
            
            //TODO: acomodar
            //IncrementResponse response = new IncrementResponse();
            //int result = request.getInput() + 1; // increment input value
            //response.setResult(result); 
            exchange.getOut().setBody(response);
        }
    }
}