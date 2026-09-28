package Generics.Ejercicio2Basico;

/**
 * Clase principal de prueba. Crea distintos arreglos (de String y de Integer)
 * y utiliza Utilidades.intercambiar() para intercambiar posiciones dentro
 * de cada uno, demostrando que el método genérico funciona igual sin importar
 * el tipo de dato que contenga el arreglo.
 */
public class Main {
    public static void main(String[] args) {

        // --- Prueba con un arreglo de String ---
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};

        System.out.println("Arreglo de nombres ANTES:");
        Utilidades.mostrarArreglo(nombres);

        Utilidades.intercambiar(nombres, 0, 3); // intercambia "Ana" con "Pedro"

        System.out.println("Arreglo de nombres DESPUÉS:");
        Utilidades.mostrarArreglo(nombres);

        System.out.println();

        // --- Prueba con un arreglo de Integer ---
        Integer[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Arreglo de números ANTES:");
        Utilidades.mostrarArreglo(numeros);

        Utilidades.intercambiar(numeros, 1, 4); // intercambia 20 con 50

        System.out.println("Arreglo de números DESPUÉS:");
        Utilidades.mostrarArreglo(numeros);

        System.out.println();

        // --- Prueba con un índice inválido ---
        System.out.println("Intentando intercambiar con un índice fuera de rango:");
        Utilidades.intercambiar(numeros, 0, 10);
    }
}
