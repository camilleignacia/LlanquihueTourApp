package ui;

import data.GestorDatos;
import model.Tour;
import service.GestorTours;

import java.util.ArrayList;

/**
 * MAIN: Clase principal del sistema.
 * Carga los tours, aplica filtros y muestra resultados en consola.
 */
public class Main {

    public static void main(String[] args) {

        // Lee el archivo y carga los tours en la lista
        GestorDatos gestor = new GestorDatos("resources/tours.txt");
        ArrayList<Tour> listaTours = gestor.cargarTours();

        // Verificar que se hayan cargado tours antes de continuar
        if (listaTours.isEmpty()) {
            System.out.println("No se encontraron tours disponibles. Verifica el archivo tours.txt.");
            return;
        }

        // Crea el gestor con los tours cargados
        GestorTours servicio = new GestorTours(listaTours);

        // Muestra todos los tours disponibles
        servicio.mostrarTodos();

        // Filtra los tours por tipo
        servicio.filtrarPorTipo("Excursión");

        // Busca tours por nombre
        servicio.buscarPorNombre("Lago");

        System.out.println();
        System.out.println("Fin de la ejecución.");
    }
}