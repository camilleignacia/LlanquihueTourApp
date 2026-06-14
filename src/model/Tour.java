package model;

/**
 * CLASE TOUR: Representa un tour de la agencia Llanquihue Tour.
 * Cada objeto almacena información básica de un tour.
 */
public class Tour {

    // ATRIBUTOS PRIVADOS
    private String nombre;
    private String tipo;
    private double precio;

    /**
     * CONSTRUCTOR CON PARÁMETROS: inicializa todos los atributos.
     */
    public Tour(String nombre, String tipo, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * toString: Retorna una representación legible del objeto.
     */
    @Override
    public String toString() {
        return "Nombre del Tour: " + nombre + " | Tipo de Tour: " + tipo + " | Precio: $" + precio;
    }
}