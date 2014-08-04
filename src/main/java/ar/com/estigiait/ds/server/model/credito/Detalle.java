package ar.com.estigiait.ds.server.model.credito;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import ar.com.estigiait.ds.server.model.factura.DetAdicional;
import ar.com.estigiait.ds.server.model.common.Impuesto;

public class Detalle {

	@XmlElement(name = "codigoInterno", required = true)
	private String codigoInterno;
	@XmlElement(name = "codigoAdicional", required = true)
	private String codigoAdicional;
	@XmlElement(name = "descripcion", required = true)
	private String descripcion;
	@XmlElement(name = "cantidad", required = true)
	private String cantidad;
	@XmlElement(name = "precioUnitario", required = true)
	private String precioUnitario;
	@XmlElement(name = "descuento", required = true)
	private Float descuento;
	@XmlElement(name = "precioTotalSinImpuesto", required = true)
	private Float precioTotalSinImpuesto;

	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "detallesAdicionales")
	@XmlElement(name = "detAdicional", required = true)
	private ArrayList<DetAdicional> detAdicional;
	
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "impuestos")
	@XmlElement(name = "impuesto", required = true)
	private ArrayList<Impuesto> impuesto;
	
}
