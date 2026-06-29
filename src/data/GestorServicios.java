package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 * CLASE GESTORSERVICIOS:
 * Crea y muestra instancias de prueba de cada subclase de ServicioTuristico.
 */
public class GestorServicios {

    /**
     * Crea y muestra dos instancias de cada subclase de ServicioTuristico.
     */
    public void mostrarServicios() {

        System.out.println("SERVICIOS TURÍSTICOS - LLANQUIHUE TOUR");
        System.out.println("---------------------------------------------------------");

        // Rutas gastronómicas
        RutaGastronomica ruta1 = new RutaGastronomica("Ruta del Queso Artesanal", 3, 4);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta Cervecera Artesanal", 4, 5);
        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println();

        // Paseos lacustres
        PaseoLacustre paseo1 = new PaseoLacustre("Kayak en Lago Llanquihue", 2, "Kayak");
        PaseoLacustre paseo2 = new PaseoLacustre("Paseo en Catamarán Lago Llanquihue", 3, "Catamarán");
        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println();

        // Excursiones culturales
        ExcursionCultural excursion1 = new ExcursionCultural("Tour Volcán Osorno", 6, "Volcán Osorno");
        ExcursionCultural excursion2 = new ExcursionCultural("Trekking Volcán Calbuco", 5, "Volcán Calbuco");
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}