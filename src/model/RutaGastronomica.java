package model;

/**
 * CLASE RUTAGASTRONOMICA:
 * Subclase de ServicioTuristico.
 * Agrega el atributo numeroDeParadas.
 */
public class RutaGastronomica extends ServicioTuristico {

    // ATRIBUTO PROPIO
    private int numeroDeParadas;

    /**
     * CONSTRUCTOR: llama a super() e inicializa el atributo propio.
     */
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // GETTER Y SETTER

    /**
     * Retorna el número de paradas de la ruta.
     */
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    /**
     * Asigna el número de paradas de la ruta.
     */
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * Retorna una representación legible de la ruta gastronómica.
     */
    @Override
    public String toString() {
        return super.toString() + " | Paradas: " + numeroDeParadas;
    }
}