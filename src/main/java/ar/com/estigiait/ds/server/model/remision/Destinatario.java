package ar.com.estigiait.ds.server.model.remision;

import javax.xml.bind.annotation.XmlElement;

public class Destinatario {
	
	@XmlElement(name = "identificacionDestinatario", required = true)
	private Integer identificacionDestinatario;
	@XmlElement(name = "razonSocialDestinatario", required = true)
	private String razonSocialDestinatario;
	@XmlElement(name = "dirDestinatario", required = true)
	private String dirDestinatario;
	@XmlElement(name = "motivoTraslado", required = true)
	private String motivoTraslado;
	@XmlElement(name = "docAduaneroUnico", required = true)
	private Integer docAduaneroUnico;
	@XmlElement(name = "codEstabDestino", required = true)
	private Integer codEstabDestino;
	@XmlElement(name = "ruta", required = true)
	private String ruta;
	@XmlElement(name = "codDocSustento", required = true)
	private Integer codDocSustento;
	@XmlElement(name = "numDocSustento", required = true)
	private String numDocSustento;
	@XmlElement(name = "numAutDocSustento", required = true)
	private Integer numAutDocSustento;	
	@XmlElement(name = "fechaEmisionDocSustento", required = true)
	private String fechaEmisionDocSustento;
	
}
