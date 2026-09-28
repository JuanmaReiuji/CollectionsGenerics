package Collections.Ejercicio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Set: garantiza que no haya elementos duplicados
        Set<Libro> biblioteca = new HashSet<>();

        // Agregamos libros, incluyendo un duplicado intencional
        biblioteca.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        biblioteca.add(new Libro("El Principito", "Antoine de Saint-Exupéry", 1943));
        biblioteca.add(new Libro("1984", "George Orwell", 1949));
        biblioteca.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967)); // duplicado


        //Imprimiendo toda la biblioteca, como hay un duplicado, la logica lo rechaza y solo mostrara 3
        System.out.println("Cantidad de libros en la biblioteca: " + biblioteca.size());


        // Recorriendo el Set con un Iterator explícito
        System.out.println("Contenido de la biblioteca:");
        Iterator<Libro> it = biblioteca.iterator();
        while (it.hasNext()) {
            Libro libroActual = it.next();
            System.out.println(libroActual);
        }
    }
}
