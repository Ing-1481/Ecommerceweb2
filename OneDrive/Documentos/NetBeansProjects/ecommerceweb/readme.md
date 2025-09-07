# Asignación No. 3 – Extensión de Funcionalidades mediante Herencia

## 📌 Descripción del Proyecto
Este proyecto corresponde a la **Asignación No. 3** del curso de Programación Orientada a Objetos.  
El objetivo es aplicar **herencia** para generalizar y especializar funcionalidades en una plataforma **e-Commerce**.  

Se implementaron clases derivadas de **Producto** y **Usuario**, permitiendo diferenciar entre productos digitales y físicos, así como entre clientes y administradores.

---

## 📂 Clases Implementadas
- **Producto (Clase base)**  
  Clase genérica para productos.  

- **ProductoDigital (Derivada de Producto)**  
  Atributos adicionales: `formatoArchivo`, `tamaño`.  

- **ProductoFisico (Derivada de Producto)**  
  Atributos adicionales: `peso`, `dimensiones`.  

- **Usuario (Clase base)**  
  Clase genérica para usuarios.  

- **Cliente (Derivada de Usuario)**  
  Funcionalidades: historial de compras, preferencias.  

- **Administrador (Derivada de Usuario)**  
  Funcionalidades: gestión de inventario, creación de promociones.  

---

## ⚙️ Tecnologías Utilizadas
- Lenguaje: **Java SE**
- Entorno de desarrollo: **NetBeans 8.2**
- Control de versiones: **GitHub**

---

## 🖼️ Diagramas UML
Se aplicó herencia en el diseño de clases:


---

## 🚀 Retos y Soluciones
- **Problema:** Dificultad inicial al estructurar las clases derivadas.  
  **Solución:** Se diseñó primero el diagrama UML y luego se implementó en código.  

- **Problema:** Errores al reutilizar constructores de la clase padre.  
  **Solución:** Uso de la palabra clave `super()` para invocar constructores de la clase base.  

- **Problema:** Organización del repositorio.  
  **Solución:** Creación de un nuevo repositorio independiente para esta asignación.  

---

## 📖 Referencias Bibliográficas
- Deitel, P. & Deitel, H. (2017). *Java: How to Program*. Pearson.  
- Oracle. (2024). [Java Documentation](https://docs.oracle.com/javase/8/docs/).  
- GitHub Docs. (2024). *Getting started with GitHub*.  

---

## 👨‍💻 Autor
- **Carlos Barrueta**  
Estudiante de Maestría en Ciencia de Desarrollo de Software  

