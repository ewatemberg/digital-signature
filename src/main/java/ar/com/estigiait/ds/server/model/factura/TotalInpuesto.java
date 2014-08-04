package ar.com.estigiait.ds.server.model.factura;

import javax.xml.bind.annotation.XmlElement;

public class TotalInpuesto {
	
	@XmlElement(name = "codigo", required = true)
	private Integer codigo;
	@XmlElement(name = "codigoPorcentaje", required = true)
	private Integer codigoPorcentaje;
	@XmlElement(name = "baseImponible", required = true)
	private Float baseImponible;
	@XmlElement(name = "valor", required = true)
	private Float valor;
		
}
