# LlanquihueTourApp - Desarrollo Orientado a Objetos I

---

## Descripción general del sistema

Sistema desarrollado en Java para la agencia Llanquihue Tour. El programa lee información de tours desde un archivo .txt, crea objetos con esos datos mediante composición entre clases y los almacena en un ArrayList. Además, implementa una jerarquía de clases con herencia para representar distintos tipos de servicios turísticos. Permite ver el catálogo completo, filtrar tours por tipo y buscar por nombre, mostrando los resultados por consola.

---

## Estructura del proyecto

```
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   ├── Tour.java
│   │   ├── Ubicacion.java
│   │   ├── ServicioTuristico.java
│   │   ├── RutaGastronomica.java
│   │   ├── PaseoLacustre.java
│   │   └── ExcursionCultural.java
│   ├── data/
│   │   ├── GestorDatos.java
│   │   └── GestorServicios.java
│   ├── service/
│   │   └── GestorTours.java
│   └── ui/
│       └── Main.java
└── resources/
    └── tours.txt
```

---

## Instrucciones para ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```
git clone https://github.com/camilleignacia/LlanquihueTourApp.git
```

2. Abre el proyecto en **IntelliJ IDEA**.

3. Verifica que el archivo `tours.txt` esté dentro de la carpeta `resources/`.

4. Ejecuta la clase `Main.java` ubicada en el paquete `ui`.

5. La consola mostrará el catálogo completo de tours, el filtro por tipo, la búsqueda por nombre y los servicios turísticos organizados por jerarquía de clases.

---

**Repositorio GitHub:** https://github.com/camilleignacia/LlanquihueTourApp

**Fecha de entrega:** 29/06/2026

---

## Autora del proyecto

- **Nombre:** Camila Sepúlveda Marcos.
- **Carrera:** Analista Programador Computacional.

---

© Duoc UC | Escuela de Informática y Telecomunicaciones
