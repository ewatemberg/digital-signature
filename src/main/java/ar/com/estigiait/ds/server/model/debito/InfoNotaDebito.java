package ar.com.estigiait.ds.server.model.debito;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import ar.com.estigiait.ds.server.model.common.Impuesto;

public class InfoNotaDebito {
	
	@XmlElement(name = "fechaEmision", required = true)
	private String fechaEmision;
	@XmlElement(name = "dirEstablecimiento", required = true)
	private String dirEstablecimiento;
	@XmlElement(name = "tipoIdentificacionComprador", required = true)
	private Integer tipoidentificacionComprador;
	@XmlElement(name = "razonSocialComprador", required = true)
	private String razonSocialComprador;
	@XmlElement(name = "identificacionComprador", required = true)
	private Integer identificacionComprador;
	@XmlElement(name = "contribuyenteEsepcial", required = true)
	private Integer contribuyenteEsepcial;
	@XmlElement(name = "obligadoContabilidad", required = true)
	private String obligadoContabilidad;
	@XmlElement(name = "rise", required = true)
	private String rise;
	@XmlElement(name = "codDocModificado", required = true)
	private Integer codDocModificado;
	@XmlElement(name = "numDocmodificado", required = true)
	private String numDocmodificado;
	@XmlElement(name = "fechaEmisionSustento", required = true)
	private String fechaEmisionSustento;
	@XmlElement(name = "totalSinImpuestos", required = true)
	private Float totalSinImpuestos;
	
	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "impuestos")
	@XmlElement(name = "impuesto", required = true)
	private ArrayList<Impuesto> impuesto;
	
	@XmlElement(name = "valorTotal", required = true)
	private Float valorTotal;

}
