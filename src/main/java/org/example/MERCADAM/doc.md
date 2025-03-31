# Practica: Servicio de compra online

## Indice

1. [Resumen](#resumen)
2. [Estructura de clases](#estructura-de-clases)
3. [Programa principal](#programa-principal)
4. [Pruebas](#pruebas)
5. [Entrega](#entrega)

## Resumen
>Este proyecto consiste en una app de compra online para un supermercado ficticio llamado **MERCADAM**.

El programa se divide en 2 partes:
- **APP de gestion**: crear clientes y productos
- **APP de zona de clientes**: autentificacion, seleccion de productos y realizacion de pedidos 
## Estructura de clases

El programa sigue el paradigma de **Programacion poriantada a objetos** y se basa en la siguiente estructura
```` PlantUML

@startuml

class Editorial {
    - String nombre
    - String pais
    - ArrayList<Libro> listaLibros
    + Editorial(String nombre, String pais)
    + String getNombre()
    + void setNombre(String nombre)
    + String getPais()
    + void setPais(String pais)
    + void anyadirLibro(Libro libro)
    + void eliminarLibro(Libro libro)
}

class Estudiante {
    + static int contadorEstudiantes
    + static final String FORMATO_CORREO
    - String nombre
    - String curso
    - int nia
    - String email
    - ArrayList<Libro> libroPrestados
    + Estudiante(String nombre)
    + Estudiante(String nombre, String curso, String email)
    + void anyadirLibro(Libro libro)
    + void borrarLibro(Libro libro)
}

class Libro {
    - String titulo
    - String autor
    - String id
    - static boolean disponible
    - static int cantidadLibros
    - static int librosDisponibles
    - static final String LIB
    - Estudiante estudiantePrestado
    - Editorial editorial
    + Libro(String titulo, String autor, Editorial editorial)
    + boolean getDisponible()
    + void setDisponible(boolean disponible)
    + void devolver(Estudiante estudiante)
}

class Prestamo {
    - Estudiante estudiante
    - Libro libro
    - LocalDate fecha
    + Prestamo(Estudiante estudiante, Libro libro)
    + LocalDate getFecha()
}

Editorial "1" o-- "*" Libro : contiene
Estudiante "1" o-- "*" Libro : presta
Libro "1" -- "1" Editorial : pertenece a
Libro "1" -- "0..1" Estudiante : prestado a
Estudiante "1" -- "*" Prestamo : realiza
Libro "1" -- "*" Prestamo : es parte de
@enduml

````
### Contenido de las clases
***Clase Cliente***
````java

package org.example.comparadores;

import lombok.Getter;

import javax.annotation.processing.Generated;
import java.util.Objects;
@Getter
public class Producto implements Comparable<Producto>{

    private String nombre;
    private Integer precio;

    public Producto(String nombre, int precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return precio == producto.precio && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public int compareTo(Producto producto) {

        int devolver = nombre.compareTo(producto.nombre);
        if (devolver != 0)
        {
            return devolver;
        }

        return precio.compareTo(producto.precio);
    }
}
````
## Programa principal
## Pruebas
## Entrega