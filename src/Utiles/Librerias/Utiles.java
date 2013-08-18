
package Utiles.Librerias;

import clase3.aula.formato.Formato;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;


public class Utiles {
   
    
    public static Date stringToDate(String fecha) {
        DateFormat dateformat= DateFormat.getDateInstance();
        Date date=null;
   
        try {
            date=dateformat.parse(fecha);
                                                                 
        Formato.textooDate();
         } catch(ParseException e){
             System.out.println("Error de formato fecha Incorrecta ");
         }
         return date;
    }
}
