package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * CLASE GESTORDATOS: lee el archivo tours.txt y carga los datos
 * como objetos Tour en un ArrayList.
 */
public class GestorDatos {

    // Ruta del archivo de datos
    private String rutaArchivo;

    // CONSTRUCTOR
    public GestorDatos(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    // Recorre el archivo y transforma cada línea en un objeto Tour
    public ArrayList<Tour> cargarTours() {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            // Recorre el archivo mientras existan líneas por leer
            while ((linea = lector.readLine()) != null) {

                // Separar los campos utilizando ";"
                String[] partes = linea.split(";");

                // Asigna cada dato a una variable
                String nombre = partes[0];
                String tipo = partes[1];
                double precio = Double.parseDouble(partes[2]);

                listaTours.add(new Tour(nombre, tipo, precio));
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}