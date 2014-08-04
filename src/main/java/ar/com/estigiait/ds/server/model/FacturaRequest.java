package ar.com.estigiait.ds.server.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import ar.com.estigiait.ds.server.model.common.InfoTributaria;
import ar.com.estigiait.ds.server.model.factura.Detalle;
import ar.com.estigiait.ds.server.model.factura.InfoFactura;
import ar.com.estigiait.ds.server.model.factura.Retencion;

/**
 * 
 * Esta clase representa la entidad Factura
 * 
 * @author Emilio Watemberg <emilio.watemberg@estigiait.com.ar>
 * 
 */
@XmlRootElement(name="Factura")
@XmlAccessorType(XmlAccessType.FIELD)
public class FacturaRequest {
	
	@XmlElement(name = "infoTributaria", required = true)
	private InfoTributaria infoTributaria;
	@XmlElement(name = "infoFactura", required = true)
	private InfoFactura infoFactura;
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "detalles")
	@XmlElement(name = "detalle", required = true)
	private Detalle detalles;
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "retenciones")
	@XmlElement(name = "retencion", required = true)
	private ArrayList<Retencion> retencion;
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "infoAdicional")
	@XmlElement(name = "campoAdicional", required = true)
	private ArrayList<String> campoAdicional;
}
