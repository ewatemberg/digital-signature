package ar.com.estigiait.ds.server.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import ar.com.estigiait.ds.server.model.common.InfoTributaria;
import ar.com.estigiait.ds.server.model.credito.Detalle;
import ar.com.estigiait.ds.server.model.credito.InfoNotaCredito;

@XmlRootElement(name="notaCredito")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditoRequest {
	
	@XmlElement(name = "infoTributaria", required = true)
	private InfoTributaria infoTributaria;
	
	@XmlElement(name = "infoNotaCredito", required = true)
	private InfoNotaCredito infoNotaCredito;
	
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "detalles")
	@XmlElement(name = "detalle", required = true)
	private ArrayList<Detalle> detalle;
	
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "infoAdicional")
	@XmlElement(name = "campoAdicional", required = true)
	private ArrayList<String> campoAdicional;

}
