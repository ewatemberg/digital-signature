package ar.com.estigiait.ds.server.model.debito;

import javax.xml.bind.annotation.XmlElement;

public class Motivo {
	
	@XmlElement(name = "razon", required = true)
	private String razon;
	@XmlElement(name = "valor", required = true)
	private Float valor;

}
