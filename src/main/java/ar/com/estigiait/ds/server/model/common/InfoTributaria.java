package ar.com.estigiait.ds.server.model.common;

import javax.xml.bind.annotation.XmlElement;

public class InfoTributaria {

	@XmlElement(name = "ambiente", required = true)
	private Integer ambiente;
	@XmlElement(name = "tipoEmision", required = true)
	private Integer tipoEmision;
	@XmlElement(name = "razonSocial", required = true)
	private String razonSocial;
	@XmlElement(name = "nombreComercial", required = true)
	private String nombreComercial;
	@XmlElement(name = "ruc", required = true)
	private Integer ruc;
	@XmlElement(name = "claveAcceso", required = true)
	private Integer claveAcceso;
	@XmlElement(name = "codDoc", required = true)
	private Integer codDoc;
	@XmlElement(name = "estab", required = true)
	private Integer estab;
	@XmlElement(name = "ptoEmi", required = true)
	private Integer ptoEmi;
	@XmlElement(name = "secuencial", required = true)
	private Integer secuencial;
	@XmlElement(name = "dirMatriz", required = true)
	private String dirMatriz;
 
}
