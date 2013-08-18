package clase2.tarea.medios.abstracts;

public abstract class Mediateca {

    private String titulo;
    private String autor;
    private int diasPrestamo;
    private int costoPrestamo;

    public double getCostoPrestamo() {
        return costoPrestamo;
    }

    public void setCostoPrestamo(int costoPrestamo) {
        this.costoPrestamo = costoPrestamo;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
