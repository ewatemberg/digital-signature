package ar.com.estigiait.ds.server.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import ar.com.estigiait.ds.server.model.common.InfoTributaria;
import ar.com.estigiait.ds.server.model.debito.InfoNotaDebito;
import ar.com.estigiait.ds.server.model.debito.Motivo;
import ar.com.estigiait.ds.server.model.factura.Detalle;
import ar.com.estigiait.ds.server.model.factura.InfoFactura;
import ar.com.estigiait.ds.server.model.factura.Retencion;

/**
 * 
 * Esta clase representa la entidad Debito
 * 
 * @author Emilio Watemberg <emilio.watemberg@estigiait.com.ar>
 * 
 */
@XmlRootElement(name="notaDebito")
@XmlAccessorType(XmlAccessType.FIELD)
public class DebitoRequest {
	
	@XmlElement(name = "infoTributaria", required = true)
	private InfoTributaria infoTributaria;
	
	@XmlElement(name = "infoNotaDebito", required = true)
	private InfoNotaDebito infoNotaDebito;
	
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "movtivos")
	@XmlElement(name = "motivo", required = true)
	private ArrayList<Motivo> motivo;
		
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "infoAdicional")
	@XmlElement(name = "campoAdicional", required = true)
	private ArrayList<String> campoAdicional;
		
	
}
