/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.aula;

import clase2.aula.zoologico.Tigre;
import java.util.Date;

public class ClaseObjetc {
    public static void main(String[] args) {
       Tigre tigreJorge = new Tigre("Jorge");
        Tigre tigreJose = new Tigre("Jorge");
        
        System.out.println(tigreJorge.equals(tigreJose));
		//retorna true
    }
    public static void rareCompare(){
        Integer numeroA=1;
               Integer numeroB=1;
               Integer numeroX= new Integer(12);
               Integer numeroY= new Integer(12);
               if (numeroA== numeroB){
                   System.out.println("Iguales Ay B");
                   
               
        }  
                     if (numeroX== numeroY){
                   System.out.println("Iguales X y B");
                   }  
              if (numeroX.intValue()== numeroY){
                   System.out.println("Iguales X y B intvalue");    
        }  
        }  
    public static void doEguals(){
        Date fechaNacimiento=new Date();
       // Date fechaCumpleaños=fechaNacimiento;
        Date fechaCumpleaños=new Date();   
        if (fechaNacimiento==fechaCumpleaños){
            System.out.println("Iguales");
        }
         if (fechaNacimiento.equals(fechaCumpleaños) ){
             System.out.println("Iguañes");   
    }
     //   
       }
  // }
    public static void soToString(){
        Date fechaNacimiento= new Date();
        System.out.println(fechaNacimiento.toString());
    }
public static void overrideToString(){
 
     ClaseObjetc myObject = new ClaseObjetc();
        System.out.println(myObject.toString());
} 
    @Override
    public String toString() {
        return ("Explicando una clase object");
    }
     
}
