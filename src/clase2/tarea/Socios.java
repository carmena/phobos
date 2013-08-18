package clase2.tarea;

public class Socios {

    private String nombre;
    private String apellido;
    private Double totalPago;
    public static int nroPrestamos = 1;

    public Double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Double totalPago) {
        this.totalPago = totalPago;
    }

    public int getNroPrestamos() {
        return nroPrestamos;
    }

    public void setNroPrestamos(int nroPrestamos) {
        this.nroPrestamos = nroPrestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static void cantidadPrestamos() {
        nroPrestamos++;

    }
}
