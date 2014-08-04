package ar.com.estigiait.ds.server.model.factura;

import javax.xml.bind.annotation.XmlElement;

public class Retencion {

	@XmlElement(name = "codigo", required = true)
	private Integer codigo;
	@XmlElement(name = "codigoPorcentaje", required = true)
	private Integer codigoPorcentaje;
	@XmlElement(name = "tarifa", required = true)
	private Float tarifa;
	@XmlElement(name = "valor", required = true)
	private Float valor;
}
