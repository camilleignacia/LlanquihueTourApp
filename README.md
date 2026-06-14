# Semana 4 - Desarrollo Orientado a Objetos I

---

## Descripción general del sistema

Sistema desarrollado en Java para la agencia Llanquihue Tour. El programa carga información de tours desde un archivo .txt,
crea objetos con esos datos y los almacena en un ArrayList. Desde la consola es posible ver el catálogo completo y filtrar los tours según su tipo.

---

## Estructura del proyecto

```
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   └── Tour.java          → Clase que representa un tour
│   ├── data/
│   │   └── GestorDatos.java   → Carga los datos del archivo en una lista de objetos
│   └── ui/
│       └── Main.java          → Clase principal del programa
└── resources/
    └── tours.txt              → Archivo de datos
```

---

## Instrucciones para ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```
git clone https://github.com/camilleignacia/llanquihue-tour.git
```

2. Abre el proyecto en **IntelliJ IDEA**.

3. Verifica que el archivo `tours.txt` esté dentro de la carpeta `resources/`.

4. Ejecuta la clase `Main.java` ubicada en el paquete `ui`.

5. La consola mostrará el catálogo completo de tours y los tours filtrados
por tipo gastronómico.

---

**Repositorio GitHub:** https://github.com/camilleignacia/LlanquihueTourApp

**Fecha de entrega:** 15/06/2026

---

## Autor del proyecto

- **Nombre completo:** Camila Sepúlveda Marcos.
- **Carrera:** Analista Programador Computacional.

---

© Duoc UC | Escuela de Informática y Telecomunicaciones
