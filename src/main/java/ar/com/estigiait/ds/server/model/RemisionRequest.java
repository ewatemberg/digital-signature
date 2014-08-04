package ar.com.estigiait.ds.server.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import ar.com.estigiait.ds.server.model.common.InfoTributaria;
import ar.com.estigiait.ds.server.model.remision.Destinatario;
import ar.com.estigiait.ds.server.model.remision.InfoGuiaRemision;

@XmlRootElement(name="guiaRemision")
@XmlAccessorType(XmlAccessType.FIELD)
public class RemisionRequest {
	
	@XmlElement(name = "infoTributaria", required = true)
	private InfoTributaria infoTributaria;
	
	@XmlElement(name = "infoGuiaRemision", required = true)
	private InfoGuiaRemision infoGuiaRemision;
	
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "destinatarios")
	@XmlElement(name = "destinatario", required = true)
	private Destinatario destinatario;
	
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "infoAdicional")
	@XmlElement(name = "campoAdicional", required = true)
	private ArrayList<String> campoAdicional;
	
}
