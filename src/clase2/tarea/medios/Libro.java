/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.tarea.medios;

import clase2.tarea.medios.abstracts.Mediateca;

public class Libro extends Mediateca {

    private int numeroPaginas;
    private String nimeroIsbn;

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getNimeroIsbn() {
        return nimeroIsbn;
    }

    public void setNimeroIsbn(String nimeroIsbn) {
        this.nimeroIsbn = nimeroIsbn;
    }
}
