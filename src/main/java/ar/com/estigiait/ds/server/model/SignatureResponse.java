package ar.com.estigiait.ds.server.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Esta clase representa la entidad que se presentará
 * en el contrato como respuesta
 * 
 * @author Emilio Watemberg <emilio.watemberg@estigiait.com.ar>
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SignatureResponse {
    
    @XmlElement(required = true)
    private int result;

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }
}