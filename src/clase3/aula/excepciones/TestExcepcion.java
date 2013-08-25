/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.aula.excepciones;

/**
 *
 * @author PFR
 */
public class TestExcepcion {
    
    public static void main(String[] args) {
        TestExcepcion.doEjeplo3Exception();
    }
    
      public static void doEjeplo4Exception()   throws  SaldoInsuficienteException{
          try{
              Cuenta cuentajose= new Cuenta(54545);
              cuentajose.retirarDeCajero(6000d);
         
          }catch(SaldoInsuficienteException e){
              System.out.println("error "+ e.getMessage());
          }          
      }
        public static void doEjeplo4()   throws  SaldoInsuficienteException{
            Cuenta cuentajose =new Cuenta(4654);
            cuentajose.retirarDeCajero(6000d);
        }
    public static void doEjeplo3Exception(){
                       
        try {
            int[] n = {11,22,33,44,55,66,77,88,99}; 
            for (int i=0; i<n.length;i++) {
                System.out.println( "Valor " + n[i]);
            }
        }  catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error" + e.toString());
       }  catch (NullPointerException e) {
            System.err.println("Erroi"+e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println( "Aplicacion Terminada ");        
        }

    }
    
       public static void doEjeplo3(){
        
        
        int[] n=null; //= {11,22,33,44,55,66,77,88,99};
        
     
        for (int i=0; i<11;i++) {
            System.out.println( "Valor " + n[i]);
        }
     
       
    }

       
      
    public static void doEjeplo2(){
           int x = (int)(Math.random() * 5);
        int y = (int)(Math.random() * 10);
        int [] z = new int[5];
        try {
            System.out.println("y/x gives " + (y/x));
            System.out.println("y is " + y + " z[y] is " + z[y]);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic problem " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Subscript problem " + e);
        } finally {
            System.out.println("Terminando la ejecución del método");
        }
        System.out.println("Continúa la ejecución del método....");
    }
    
    
    

             
        public static void doEjemplo1(){
        int i = 0, u = 0, k;
        k = i / u;
    }
        
      public static void doEjemplo1Excepction(){
           
        try {
             int i = 0, u = 0, k;
            k = i / u;
        } catch(ArithmeticException e){
            System.out.println("Hubo un error: " + e.toString());
        }

    }

}
