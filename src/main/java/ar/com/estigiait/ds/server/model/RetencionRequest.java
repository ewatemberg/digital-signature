package ar.com.estigiait.ds.server.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import ar.com.estigiait.ds.server.model.common.Impuesto;
import ar.com.estigiait.ds.server.model.common.InfoTributaria;
import ar.com.estigiait.ds.server.model.retencion.InfoCompRetencion;

@XmlRootElement(name="comprobanteRetencion")
@XmlAccessorType(XmlAccessType.FIELD)
public class RetencionRequest {

	@XmlElement(name = "infoTributaria", required = true)
	private InfoTributaria infoTributaria;
	
	@XmlElement(name = "infoCompRetencion", required = true)
	private InfoCompRetencion infoCompRetencion;
	
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "impuestos")
	@XmlElement(name = "impuesto", required = true)
	private ArrayList<Impuesto> impuesto;

	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "infoAdicional")
	@XmlElement(name = "campoAdicional", required = true)
	private ArrayList<String> campoAdicional;
	
}
