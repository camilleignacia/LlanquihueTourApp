package model;

/**
 * CLASE PASEOLACUSTRE:
 * Subclase de ServicioTuristico.
 * Agrega el atributo tipoEmbarcacion.
 */
public class PaseoLacustre extends ServicioTuristico {

    // ATRIBUTO PROPIO
    private String tipoEmbarcacion;

    /**
     * CONSTRUCTOR: llama a super() e inicializa el atributo propio.
     */
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // GETTER Y SETTER

    /**
     * Retorna el tipo de embarcación.
     */
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    /**
     * Asigna el tipo de embarcación.
     */
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Retorna una representación legible del paseo lacustre.
     */
    @Override
    public String toString() {
        return super.toString() + " | Embarcación: " + tipoEmbarcacion;
    }
}