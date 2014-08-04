package ar.com.estigiait.ds.server.model.remision;

import javax.xml.bind.annotation.XmlElement;

public class InfoGuiaRemision {
	
	@XmlElement(name = "dirEstablecimiento", required = true)
	private String dirEstablecimiento;
	@XmlElement(name = "dirPartida", required = true)
	private String dirPartida;
	@XmlElement(name = "razonSocialTransportista", required = true)
	private String razonSocialTransportista;
	@XmlElement(name = "tipoIdentificacionTransportista", required = true)
	private Integer tipoIdentificacionTransportista;
	@XmlElement(name = "rucTransportista", required = true)
	private Integer rucTransportista;
	@XmlElement(name = "rise", required = true)
	private String rise;
	@XmlElement(name = "contribuyenteEspecial", required = true)
	private Integer contribuyenteEspecial;
	@XmlElement(name = "fechaIniTransoporte", required = true)
	private String fechaIniTransoporte;
	@XmlElement(name = "fechaFinTransporte", required = true)
	private String fechaFinTransporte;
	@XmlElement(name = "placa", required = true)
	private String placa;
	
}	
