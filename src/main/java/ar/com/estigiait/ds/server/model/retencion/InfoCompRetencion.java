package ar.com.estigiait.ds.server.model.retencion;

import javax.xml.bind.annotation.XmlElement;

public class InfoCompRetencion {

		@XmlElement(name = "fechaEmision", required = true)
		private String fechaEmision;
		@XmlElement(name = "dirEstablecimiento", required = true)
		private String dirEstablecimiento;
		@XmlElement(name = "contribuyenteEspecial", required = true)
		private Integer contribuyenteEspecial;
		@XmlElement(name = "obligadoContabilidad", required = true)
		private Integer obligadoContabilidad;		
		@XmlElement(name = "tipoIdentificacionSujetoRetenido", required = true)
		private Integer tipoIdentificacionSujetoRetenido;		
		@XmlElement(name = "razonSocialSujetoRetenido", required = true)
		private String razonSocialSujetoRetenido;
		@XmlElement(name = "identificacionSujetoRetenido", required = true)
		private Integer identificacionSujetoRetenido;		
		@XmlElement(name = "periodoFiscal", required = true)
		private String periodoFiscal;
	

}
