package ar.com.estigiait.ds.tool;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Esta clase contiene herramientas de distinta utilidad.
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
	
}
