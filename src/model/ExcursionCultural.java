package model;

/**
 * CLASE EXCURSIONCULTURAL:
 * Subclase de ServicioTuristico.
 * Agrega el atributo lugarHistorico.
 */
public class ExcursionCultural extends ServicioTuristico {

    // ATRIBUTO PROPIO
    private String lugarHistorico;

    /**
     * CONSTRUCTOR: llama a super() e inicializa el atributo propio.
     */
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // GETTER Y SETTER

    /**
     * Retorna el lugar histórico de la excursión.
     */
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    /**
     * Asigna el lugar histórico de la excursión.
     */
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Retorna una representación legible de la excursión cultural.
     */
    @Override
    public String toString() {
        return super.toString() + " | Lugar histórico: " + lugarHistorico;
    }
}