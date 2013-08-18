package clase2.tarea;

import clase2.tarea.medios.Audio;
import clase2.tarea.medios.Libro;
import clase2.tarea.medios.Video;
import clase2.tarea.medios.abstracts.Mediateca;

public class Prestamos {

    public static void main(String[] args) {
        registrarSocio("Carmen", "Asencio");
        Audio medio = new Audio();
        Prestamos.solicitaPrestamo(medio, 1);
        Prestamos.solicitaPrestamo(new Libro(), 3);
        Prestamos.solicitaPrestamo(new Video(), 2);

        Prestamos.solicitaPrestamo(new Libro(),4);
        //  Prestamos.solicitaPrestamo(new Libro()); 
    }

    public static void solicitaPrestamo(Mediateca medio, int diasPresta) {
        Socios socio = new Socios();
        //System.out.println(socio.getNroPrestamos());
        if (socio.getNroPrestamos() > 3) {
            System.out.println("A Sobrepasado la Cantidad de Pestamos");
        } else {

            // if (socio.se)
            if (medio instanceof Audio) {
                Audio audio = (Audio) medio;
                audio.setDiasPrestamo(diasPresta);
                audio.setCostoPrestamo(20);

                socio.setTotalPago((audio.getDiasPrestamo() * audio.getCostoPrestamo()));
                System.out.println("Presto una cinta de Audio,el pago es " + socio.getTotalPago());
            } else if (medio instanceof Libro) {
                Libro libro = (Libro) medio;
                libro.setDiasPrestamo(diasPresta);
                libro.setCostoPrestamo(15);
                socio.setTotalPago((libro.getDiasPrestamo() * libro.getCostoPrestamo()));
                System.out.println("Presto un Libro,el pago es " + socio.getTotalPago());
            } else if (medio instanceof Video) {
                Video video = (Video) medio;
                video.setDiasPrestamo(diasPresta);
                video.setCostoPrestamo(10);
                socio.setTotalPago((video.getDiasPrestamo() * video.getCostoPrestamo()));
                System.out.println("Presto una cinta de Video,el pago es " + socio.getTotalPago());
            }

            Socios.cantidadPrestamos();


        }
    }

    public static void registrarSocio(String Nombre, String Apellido) {
        Socios socio = new Socios();
        socio.setNombre(Nombre);
        socio.setApellido(Apellido);
        System.out.println(socio.getNombre());
        System.out.println(socio.getApellido());
    }
}
