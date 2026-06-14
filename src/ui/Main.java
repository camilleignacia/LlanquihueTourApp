package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * CLASE MAIN: Clase principal del sistema.
 * Permite cargar los tours desde archivo, muestra el catálogo
 * completo y filtra los tours de tipo gastronómico.
 */
public class Main {

    public static void main(String[] args) {

        // Carga los datos desde el archivo.
        GestorDatos gestor = new GestorDatos("resources/tours.txt");
        ArrayList<Tour> listaTours = gestor.cargarTours();

        // Recorrido: mostrar todos los tours.
        System.out.println("--- CATÁLOGO AGENCIA DE TURISMO LLANQUIHUE TOUR ---");
        for (Tour tour : listaTours) {
            System.out.println(tour);
        }

        // Filtrado: mostrar solo los tours de tipo gastronómico.
        System.out.println("\n--- TOURS GASTRONÓMICOS ---");
        for (Tour tour : listaTours) {
            if (tour.getTipo().equalsIgnoreCase("Gastronómico")) {
                System.out.println(tour);
            }
        }
    }
}