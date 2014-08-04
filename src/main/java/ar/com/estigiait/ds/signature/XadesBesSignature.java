package ar.com.estigiait.ds.signature;

import org.w3c.dom.Document;

import es.mityc.firmaJava.libreria.xades.DataToSign;
import es.mityc.firmaJava.libreria.xades.XAdESSchemas;
import es.mityc.javasign.xml.refs.InternObjectToSign;
import es.mityc.javasign.xml.refs.ObjectToSign;

/**
 * Esta clase define los datos de accesos a las operaciones de 
 * una firma digital XAdES-BES
 * 
 * @author Emilio Watemberg <emilio.watemberg@estigiait.com.ar>
 * 
 **/
public class XadesBesSignature extends GenericXMLSignature{


    
    private static String nameFile;
    private static String pathFile; 
    
    /**
    * Recurso a firmar
    * 
    */
    private String fileToSign;
      
    /**
    * Fichero donde se desea guardar la firma
    * 
    */
    public XadesBesSignature(String fileToSign) {
        super();
        this.fileToSign = fileToSign;
    }

    /**
       * 
       * Método que permite agregar la firma digital a un documento
       * mediante el úso de un certificado específico
       * utilizando el estandar XAdES-BES
       * 
       * @param xmlPath
       * 			Path del xml resources a firmar.
       * @param pathSignature
       * 			Path perteneciente al certificado.
       * @param passSignature
       * 			Password del certificado a utilizar.
       * @param pathOut
       * 			Path donde se guardará el documento firmado.
       * @param nameFileOut
       * 			Nombre del archivo modificado con la firma.
       *            
       */
    public static void firmar(String xmlPath,String pathSignature,String passSignature,String pathOut,String nameFileOut)
    {               	
    	 XadesBesSignature signature = new XadesBesSignature(xmlPath);
		 signature.setPassSignature(passSignature);
		 signature.setPathSignature(pathSignature);
		 pathFile=pathOut;
		 nameFile=nameFileOut;
          
         signature.execute();
      }
      
      
      @Override
      protected DataToSign createDataToSign() {
          
          DataToSign datosAFirmar = new DataToSign();

          datosAFirmar.setXadesFormat(es.mityc.javasign.EnumFormatoFirma.XAdES_BES);
           
          datosAFirmar.setEsquema(XAdESSchemas.XAdES_132);
          datosAFirmar.setXMLEncoding("UTF-8");
          datosAFirmar.setEnveloped(true);
          datosAFirmar.addObject(new ObjectToSign(new InternObjectToSign("comprobante"), "contenido comprobante", null, "text/xml", null));
          datosAFirmar.setParentSignNode("comprobante");

          Document docToSign = getDocument(fileToSign);
          datosAFirmar.setDocument(docToSign);

          return datosAFirmar;
      }
  

    @Override
    protected String getSignatureFileName() {
        return XadesBesSignature.nameFile;
    }
    
    @Override
    protected String getPathOut() {
        return XadesBesSignature.pathFile;
    }

}
