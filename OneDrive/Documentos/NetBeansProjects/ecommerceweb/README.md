## Asignación 5 — Encapsulamiento y Abstracción

**Cambios clave**
- `Item` (abstracta): `id`, `nombre`, `precio` con validaciones (precio ≥ 0).
- `Producto` (abstracta): obliga `mostrarDetalle()`.
- `ProductoDigital` y `ProductoFisico`: atributos `private`, getters/setters con validaciones; constructores con y sin `id` (compatibilidad).
- `Usuario`: setter de email con validación de formato.
- `Carrito`: lista interna privada, `getItems()` inmodificable, validaciones en `agregarProducto`.



**Desafíos y soluciones**
- tuve un problema que al compilar en el servidor me daba error 404, y se soluciono por un tema de codigo en el carritoservlet.java
- Compatibilidad con Asig. 4 → constructores “legacy” sin `id`.
- JDK 8 sin `isBlank()` → reemplazo por `trim().isEmpty()`.
- Integración con servlets → pruebas en navegador y log.

**Conclusión**  
Se reforzó la integridad del dominio (encapsulamiento + validaciones) y la extensibilidad (abstracción), manteniendo el comportamiento previo.

## Evidencias de la Asignación 5

Captura en navegador:  
![Navegador mostrando ejecución](docs/a5-navegador.png)

Captura de consola/output en NetBeans:  
![Output de NetBeans](docs/a5-output.png)
