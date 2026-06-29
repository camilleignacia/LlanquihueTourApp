package model;

/**
 * CLASE SERVICIOTURISTICO:
 * Superclase que representa un servicio turístico genérico.
 * Las subclases heredan nombre y duracionHoras.
 */
public class ServicioTuristico {

    // ATRIBUTOS PRIVADOS
    private String nombre;
    private int duracionHoras;

    /**
     * CONSTRUCTOR CON PARÁMETROS: inicializa nombre y duración en horas.
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // GETTERS Y SETTERS

    /**
     * Retorna el nombre del servicio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del servicio.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la duración en horas.
     */
    public int getDuracionHoras() {
        return duracionHoras;
    }

    /**
     * Asigna la duración en horas.
     */
    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    /**
     * Retorna una representación legible del servicio.
     */
    @Override
    public String toString() {
        return "Servicio: " + nombre + " | Duración: " + duracionHoras + " horas";
    }
}