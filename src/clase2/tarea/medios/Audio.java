package clase2.tarea.medios;

import clase2.tarea.medios.abstracts.Mediateca;

public class Audio extends Mediateca {

    private String lugar;
    private String duracion;
    private String tipo;

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
