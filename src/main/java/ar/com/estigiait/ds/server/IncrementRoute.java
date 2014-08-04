package ar.com.estigiait.ds.server;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;

import ar.com.estigiait.ds.server.model.IncrementRequest;
import ar.com.estigiait.ds.server.model.IncrementResponse;

/**
 * 
 * 
 * @author Emilio Watemberg <emilio.watemberg@estigiait.com.ar>
 * 
 */
public class IncrementRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        JaxbDataFormat jaxb = new JaxbDataFormat(IncrementRequest.class.getPackage().getName());
        
        from("spring-ws:rootqname:{http://camel.apache.org/example/increment}incrementRequest?endpointMapping=#endpointMapping")
            .unmarshal(jaxb)
            .process(new IncrementProcessor())
            .marshal(jaxb);
    }
    
    /**
     * 
     *
     */
    private static final class IncrementProcessor implements Processor {
        public void process(Exchange exchange) throws Exception {
            IncrementRequest request = exchange.getIn().getBody(IncrementRequest.class);
            IncrementResponse response = new IncrementResponse();
            int result = request.getInput() + 1; // increment input value
            response.setResult(result); 
            exchange.getOut().setBody(response);
        }
    }
   
}