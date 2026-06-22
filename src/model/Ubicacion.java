package model;

/**
 * CLASE UBICACION:
 * Representa la ubicación geográfica de un tour.
 * Se usa mediante COMPOSICIÓN dentro de la clase Tour (relación has-a): Tour TIENE UNA Ubicacion.
 */
public class Ubicacion {

    // Datos de ubicación
    private String ciudad;
    private String region;

    /**
     * CONSTRUCTOR CON PARÁMETROS: Inicializa ciudad y región.
     */
    public Ubicacion(String ciudad, String region) {
        this.ciudad = ciudad;
        this.region = region;
    }

    // Métodos de acceso (getter y setter)

    /**
     * Retorna la ciudad del tour.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Asigna la ciudad del tour.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Retorna la región del tour.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Asigna la región del tour.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Retorna una representación legible de la ubicación.
     */
    @Override
    public String toString() {
        return ciudad + ", " + region;
    }
}