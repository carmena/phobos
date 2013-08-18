/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.aula.usoInterface;

/**
 *
 * @author PFR
 */
public class Oracion implements Capitalizable{

    private String texto;
    public Oracion(String texto) {
        this.texto=texto;
    }
    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }
 
    @Override
    public String cambiaMinuscula() {
            return texto.toLowerCase();
    }
    public String agregaPalabra(String t) {
     texto=texto.concat(" "+t);
     return texto;

   }
    
}
