package ar.com.estigiait.ds.server.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Esta clase representa la entidad que se presentará
 * en el contrato como entrada
 * 
 * @author Emilio Watemberg <emilio.watemberg@estigiait.com.ar>
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class IncrementRequest {

    @XmlElement(required = true)
    private int input;

    public int getInput() {
        return input;
    }

    public void setInpu(int input) {
        this.input = input;
    }
}