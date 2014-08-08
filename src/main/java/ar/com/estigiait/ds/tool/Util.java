package ar.com.estigiait.ds.tool;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Esta clase contiene herramientas para trabajar con strings.
 * 
 * @author Emilio Watemberg <emilio.watemberg@estigiait.com.ar>
 *
 */
public class Util{
		
	
	/**
	 * Convierte un objeto Date en un String con formato (MM/dd/yyyy)
	 * @param String date
	 * @return Date
	 */
	public static Date dateFormatToDate (String date){
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date convertDate = null;
        try {
            convertDate = format.parse(date);
            return convertDate;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
	}
	
	/**
	 * Convierte un objeto String en Date con formato (MM/dd/yyyy)
	 * @param Date date
	 * @return String
	 */
	public static String dateFormatToString(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
    	String fecha = sdf.format(date);
    	return fecha;
	}
	
	/**
	 * Retorna un objeto Properties con las propiedades de la aplicacion.
	 * @return Properties
	 */
	public static Properties getProperties(){
		Properties prop = new Properties();
		InputStream input = null;
	 
		try {
	 		URL fileURL = Util.class.getResource("/conf-signature.properties");	
			input = fileURL.openStream();
	 
			//cargamos el archivo de propiedades
			prop.load(input);
	 
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return prop;
		
	}
	
    /**
     * Devuelve el Document correspondiente al
     * resource pasado como parámetro
     * 
     * @param resource
     *            El recurso que se desea obtener
     * @return Document
     * 			El Document asociado al resource
     */
    public static Document getDocument(String resource) {
         Document doc = null;
         DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
         dbf.setNamespaceAware(true);
         InputStream is = new ByteArrayInputStream(resource.getBytes(StandardCharsets.UTF_8));
         try {
            DocumentBuilder db = dbf.newDocumentBuilder();
           
            doc=db.parse(is);
         } catch (ParserConfigurationException ex) {
             System.err.println("Error al parsear el documento");
             ex.printStackTrace();
             System.exit(-1);
         } catch (SAXException ex) {
             System.err.println("Error al parsear el documento");
             ex.printStackTrace();
             System.exit(-1);
         } catch (IOException ex) {
             System.err.println("Error al parsear el documento");
             ex.printStackTrace();
             System.exit(-1);
         } catch (IllegalArgumentException ex) {
            System.err.println("Error al parsear el documento");
             ex.printStackTrace();
            System.exit(-1);
         }
         return doc;
     }
	
}
