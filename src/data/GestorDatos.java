package data;

import model.Tour;
import model.Ubicacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * CLASE GESTORDATOS:
 * Lee el archivo tours.txt y carga los datos como objetos Tour en un ArrayList.
 */
public class GestorDatos {

    // Ruta del archivo de datos
    private String rutaArchivo;

    /**
     * CONSTRUCTOR CON PARÁMETROS
     * Inicializa con la ruta del archivo.
     */
    public GestorDatos(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    // Métodos de acceso (getter y setter)

    /**
     * Retorna la ruta del archivo.
     */
    public String getRutaArchivo() {
        return rutaArchivo;
    }

    /**
     * Asigna la ruta del archivo de datos.
     */
    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    /**
     * Lee el archivo, construye objetos Tour con su Ubicacion y los almacena en un ArrayList.
     */
    public ArrayList<Tour> cargarTours() {

        // Lista dinámica donde se almacenarán los tours leídos
        ArrayList<Tour> listaTours = new ArrayList<>();

        // try-with-resources: abre el archivo y lo cierra automáticamente al terminar
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                // Ignorar líneas vacías
                if (linea.trim().isEmpty()) {
                    continue;
                }

                // Divide cada línea por punto y coma
                String[] partes = linea.split(";");

                // Obtiene cada dato de la línea
                String nombre = partes[0].trim();
                String tipo   = partes[1].trim();
                double precio = Double.parseDouble(partes[2].trim());
                String ciudad = partes[3].trim();
                String region = partes[4].trim();

                // Crea la ubicación del tour
                Ubicacion ubicacion = new Ubicacion(ciudad, region);

                // Crea el tour con todos sus datos
                Tour tour = new Tour(nombre, tipo, precio, ubicacion);

                // Añade el tour a la lista
                listaTours.add(tour);
            }

        } catch (IOException e) {
            System.out.println("No se pudo abrir el archivo \""
                    + rutaArchivo + "\": " + e.getMessage());
        }

        return listaTours;
    }

    /**
     * toString: Retorna una representación legible del gestor de datos.
     */
    @Override
    public String toString() {
        return "GestorDatos { archivo: \"" + rutaArchivo + "\" }";
    }
}