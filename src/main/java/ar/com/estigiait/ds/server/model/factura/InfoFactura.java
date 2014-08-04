package ar.com.estigiait.ds.server.model.factura;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class InfoFactura {

		@XmlElement(name = "fechaEmision", required = true)
		private String fechaEmision;
		@XmlElement(name = "dirEstablecimiento", required = true)
		private String dirEstablecimiento;
		@XmlElement(name = "contribuyenteEsepecial", required = true)
		private Integer contribuyenteEsepecial;
		@XmlElement(name = "obligadoContabilidad", required = true)
		private String obligadoContabilidad;
		@XmlElement(name = "tipoIdentificacionComprador", required = true)
		private Integer tipoIdentificacionComprador;
		@XmlElement(name = "guiaRemision", required = true)
		private String guiaRemision;
		@XmlElement(name = "razonSocialComprador", required = true)
		private String razonSocialComprador;
		@XmlElement(name = "identificacionComprador", required = true)
		private Integer identificacionComprador;
		@XmlElement(name = "totalSinImpuestos", required = true)
		private Float totalSinImpuestos;
		@XmlElement(name = "totalDescuento", required = true)
		private Float totalDescuento;
		
		// XmLElementWrapper generates a wrapper element around XML representation
		@XmlElementWrapper(name = "totalConInpuestos")
		@XmlElement(name = "totalImpuesto", required = true)
		private ArrayList<TotalInpuesto> totalConInpuestos;
		
		private Float propina;
		private Float importeTotal;
		private String moneda;	
		
}
