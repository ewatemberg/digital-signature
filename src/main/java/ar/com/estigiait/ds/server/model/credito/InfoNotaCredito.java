package ar.com.estigiait.ds.server.model.credito;

import javax.xml.bind.annotation.XmlElement;

public class InfoNotaCredito {
	
	@XmlElement(name = "fechaEmision", required = true)
	private String fechaEmision;
	@XmlElement(name = "dirEstablecimiento", required = true)
	private String dirEstablecimiento;
	@XmlElement(name = "tipoIdentificacionComprador", required = true)
	private Integer tipoidentificacionComprador;
	@XmlElement(name = "contribuyenteEspecial", required = true)
	private Integer contribuyenteEspecial;
	@XmlElement(name = "obligadoContabilidad", required = true)
	private String obligadoContabilidad;
	@XmlElement(name = "rise", required = true)
	private String rise;
	@XmlElement(name = "codDocModificado", required = true)
	private Integer codDocModificado;
	@XmlElement(name = "numDocmodificado", required = true)
	private String numDocmodificado;
	@XmlElement(name = "fechaEmisionDocSustento", required = true)
	private String fechaEmisionDocSustento;
	@XmlElement(name = "totalSinImpuestos", required = true)
	private Float totalSinImpuestos;
	@XmlElement(name = "valorModificacion", required = true)
	private Float valorModificacion;
	@XmlElement(name = "moneda", required = true)
	private String moneda;




	

}
