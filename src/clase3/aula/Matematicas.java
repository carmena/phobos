
package clase3.aula;


public class Matematicas {
    public static void main(String[] args) {
        System.out.println(Matematicas.dooperaciones());
        Matematicas.wapper();
    }
    
    public static void getContantes(){
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
    public static double  dooperaciones(){
        return Math.sqrt(144);
    }
    public static void wapper(){
        Integer  entero= new Integer(123);
        System.out.println(entero.shortValue());
    }
}
