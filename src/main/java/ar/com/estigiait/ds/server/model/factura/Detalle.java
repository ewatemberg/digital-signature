package ar.com.estigiait.ds.server.model.factura;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import ar.com.estigiait.ds.server.model.common.Impuesto;


public class Detalle {
	
	@XmlElement(name = "codigoPrincipal", required = true)
	private String codigoPrincipal;
	@XmlElement(name = "codigoAuxiliar", required = true)
	private String codigoAuxiliar;
	@XmlElement(name = "codigo", required = true)
	private String codigo;
	@XmlElement(name = "cantidad", required = true)
	private Float cantidad;
	@XmlElement(name = "precioUnitario", required = true)
	private Float precioUnitario;
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
