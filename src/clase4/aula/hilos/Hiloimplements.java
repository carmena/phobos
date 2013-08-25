
package clase4.aula.hilos;

public class Hiloimplements implements  Runnable{
    
    
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
   
    }    
}
