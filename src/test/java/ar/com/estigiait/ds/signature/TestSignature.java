package ar.com.estigiait.ds.signature;

import org.junit.Test;


/**
 * 
 * Test para {link XadesBesSignature.java}
 * 
 * Esta clase permitirá testear las operaciones asociadas
 * a la firma digital enveloped.
 * 
 * @author Emilio Watemberg <emilio.watemberg@estigiait.com.ar>
 * 
 */
public class TestSignature {

	/**
	 * Este test permite crear una firma digital, con los datos
	 * provenientes de factural_in.xml y guardarlos
	 * en factura_out.xml
	 * 
	 */
	@Test
	public void testSignatureEnveloped(){
			
		//
		XadesBesSignature.firmar(TestSignature.class.getResource("/factura_in.xml").getPath().toString(),
				TestSignature.class.getResource("/usr0061.p12").getPath().toString().toString(),
				"usr0061", 
				".", 
				"factura_out.xml");
	}
	

}
