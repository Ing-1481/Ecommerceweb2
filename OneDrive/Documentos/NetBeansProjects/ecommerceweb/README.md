# Plataforma e-Commerce – Asignación 4

## Descripción
Se implementaron **polimorfismo**, **sobrecarga** y **sobreescritura** en la plataforma e-Commerce (Java + Servlets, NetBeans).

## Funcionalidades implementadas
- **Sobrecarga** en `Carrito`:
  - `agregarProducto(int id)`
  - `agregarProducto(Producto p)`
  - `agregarProducto(String nombre, double precio)`
- **Polimorfismo**: métodos que reciben `Producto` y funcionan con `ProductoDigital` y `ProductoFisico`.
- **Sobreescritura**: `mostrarDetalle()` personalizado en cada subclase de `Producto`.

## Evidencia de pruebas
**Navegador (out.println):**  
![Prueba navegador](docs/captura-navegador.png)

**Output de NetBeans (System.out.println):**  
![Prueba Output](docs/captura-output.png)

## Tecnologías
Java (Servlets), NetBeans, Tomcat/GlassFish, Git & GitHub

