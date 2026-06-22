package model;

/**
 * CLASE TOUR:
 * Representa un tour de la agencia Llanquihue Tour.
 * Aplica composición: Tour TIENE UNA Ubicacion.
 */
public class Tour {

    // Datos del tour
    private String nombre;
    private String tipo;
    private double precio;
    private Ubicacion ubicacion; // Composición: Tour tiene una Ubicacion

    /**
     * CONSTRUCTOR CON PARÁMETROS: Inicializa los atributos del tour
     */
    public Tour(String nombre, String tipo, double precio, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        setPrecio(precio); // Valida que el precio sea mayor a 0.
    }

    // Métodos de acceso (getter y setter)

    /**
     * Retorna el nombre del tour.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del tour.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el tipo del tour.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Asigna el tipo del tour.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna el precio del tour en CLP.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Asigna el precio del tour.
     * Si el precio es menor o igual a 0, muestra un mensaje.
     */
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio inválido (" + precio + "), se asigna 0.");
            this.precio = 0;
        }
    }

    /**
     * Retorna la ubicación del tour.
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Asigna la ubicación del tour.
     */
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * toString: Retorna una representación legible del tour.
     */
    @Override
    public String toString() {
        return "Nombre del Tour: " + nombre + " | Tipo de Tour: " + tipo + " | Precio: $" + (int) precio + " | Lugar: " + ubicacion;
    }
}