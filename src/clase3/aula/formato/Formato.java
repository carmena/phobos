
package clase3.aula.formato;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import Utiles.Librerias.Utiles;



public class Formato {
    public static void main(String[] args) {
        try {
            Utiles.stringToDate("15/08/2017");
       
      Formato.textooDate();
         } catch(ParseException e){
             System.out.println("Error de formato ");
         }
         
         
    }
    
    public static void textooDate() throws ParseException{
        DateFormat dateForma= DateFormat.getDateInstance();
        Date fecha= dateForma.parse("29/08/2013");
        System.out.println(fecha);
        
 
             
    }
    public static void getFormatoFecha3() {
        Calendar c1 = new GregorianCalendar(2011,9,1);				
		Date d1 = c1.getTime();
		
		Calendar c2 = new GregorianCalendar(2011,9,3);
		Date d2 = c2.getTime();

		if (d1.after(d2)) {
			System.out.println("d1 es después que d2");
		}
		if (d1.before(d2)) {
			System.out.println("d1 es antes que d2");
		}

    }
    public static void getFormatoFecha2() {
        Date now = new Date();
        System.out.println(now.getTime());
        
        DateFormat df =  DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        //DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        
        String s =  df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        String s5 = df5.format(now);
        
        System.out.println("(Default) Hoy es " + s);
        System.out.println("(SHORT)   Hoy es " + s1);
        System.out.println("(MEDIUM)  Hoy es " + s2);
        System.out.println("(LONG)    Hoy es " + s3);
        System.out.println("(FULL)    Hoy es " + s4);
        System.out.println("(CUSTOM)  Hoy es " + s5);

    }
    public static void voidFormatoFecha() {
                GregorianCalendar ahora = new GregorianCalendar();
        
        // Crear una fecha
         ahora = new GregorianCalendar(2007,2,2);
               
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
        //
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
        //
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));

    }
    public static void getFormatoMoneda() {
         NumberFormat formatGermany = NumberFormat.getInstance(Locale.US);
        
        // Agrupar 
        formatGermany.setGroupingUsed(true);        
        System.out.println(formatGermany.format(10000000.0045451));

        // No agrupar
        formatGermany.setGroupingUsed(false);       
        System.out.println(formatGermany.format(10000000.0045451));
        
        System.out.println("Con 3 enteros mínimo");
        formatGermany.setMinimumIntegerDigits(3);
        System.out.println(formatGermany.format(12));
        
        System.out.println("Con 5 enteros máximo");
        formatGermany.setMaximumIntegerDigits(5);
        System.out.println(formatGermany.format(123456));
        
        System.out.println("Con 4 enteros máximo en los decimales");
        formatGermany.setMaximumFractionDigits(4);
        System.out.println(formatGermany.format(123.981454));
        
        System.out.println("Con 2 enteros mínimo en los decimales");
        formatGermany.setMinimumFractionDigits(2);
        System.out.println(formatGermany.format(45.2));		

    }
}
