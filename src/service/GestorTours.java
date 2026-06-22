package service;

import model.Tour;

import java.util.ArrayList;

/**
 * CLASE GESTORTOUR:
 * Permite recorrer, filtrar y buscar tours dentro de la lista
 * cargada previamente por GestorDatos.
 */
public class GestorTours {

    // Lista de tours del sistema
    private ArrayList<Tour> listaTours;

    /**
     * CONSTRUCTOR CON PARÁMETROS: Recibe la lista de tours ya cargada desde el archivo.
     */
    public GestorTours(ArrayList<Tour> listaTours) {
        this.listaTours = listaTours;
    }

    // Métodos de acceso (getter y setter)

    /**
     * Retorna la lista de tours.
     */
    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }

    /**
     * Reemplaza la lista de tours.
     */
    public void setListaTours(ArrayList<Tour> listaTours) {
        this.listaTours = listaTours;
    }

    /**
     * Muestra todos los tours de la lista en consola.
     */
    public void mostrarTodos() {
        System.out.println();
        System.out.println("Bienvenido al sistema de gestión de Llanquihue Tour");
        System.out.println();
        System.out.println("CATÁLOGO AGENCIA DE TURISMO LLANQUIHUE TOUR");
        System.out.println("---------------------------------------------------------");

        if (listaTours.isEmpty()) {
            System.out.println("Actualmente no hay tours registrados.");
            return;
        }

        for (Tour tour : listaTours) {
            System.out.println(tour);
        }
    }

    /**
     * Filtra y muestra los tours del tipo indicado.
     */
    public void filtrarPorTipo(String tipo) {
        System.out.println();
        System.out.println("RESULTADOS TOURS DE TIPO: " + tipo.toUpperCase());
        System.out.println("---------------------------------------------------------");

        ArrayList<Tour> resultado = new ArrayList<>();

        for (Tour tour : listaTours) {
            if (tour.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(tour);
            }
        }

        if (resultado.isEmpty()) {
            System.out.println("No hay tours registrados de tipo \"" + tipo + "\".");
        } else {
            for (Tour tour : resultado) {
                System.out.println(tour);
            }
        }
    }

    /**
     * Busca y muestra tours cuyo nombre contiene la palabra indicada.
     */
    public void buscarPorNombre(String palabra) {
        System.out.println();
        System.out.println("RESULTADOS DE BÚSQUEDA PARA: \"" + palabra + "\"");
        System.out.println("---------------------------------------------------------");

        boolean encontrado = false;

        for (Tour tour : listaTours) {
            if (tour.getNombre().toLowerCase().contains(palabra.toLowerCase())) {
                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours con \"" + palabra + "\" en el nombre.");
        }
    }

    /**
     * toString: Retorna una representación legible del gestor.
     */
    @Override
    public String toString() {
        return "GestorTours { tours cargados: " + listaTours.size() + " }";
    }
}