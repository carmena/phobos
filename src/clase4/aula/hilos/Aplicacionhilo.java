/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.aula.hilos;

/**
 *
 * @author PFR
 */
public class Aplicacionhilo {
    public static void main(String[] args) {
        Aplicacionhilo.doHiloimplements();
     
    }
    
    public static void doHiloimplements() {
        Hiloimplements hilo= new Hiloimplements();
        Thread th= new Thread(hilo);
        th.start();
  
        
        
    }
    public static void dohiloHerencia() {
        Hiloherencia hilo = new Hiloherencia();
        hilo.start();
                
    }
            
   
}
