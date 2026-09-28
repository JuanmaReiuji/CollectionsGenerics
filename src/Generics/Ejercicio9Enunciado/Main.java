package Generics.Ejercicio9Enunciado;

import java.util.ArrayList;

/**
 * Clase principal de prueba. Llena un InventarioCaja de enteros y otro de
 * String, y comprueba que filtrarMayoresQue() devuelve correctamente solo
 * los elementos por encima del umbral indicado.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== InventarioCaja de enteros ===");
        InventarioCaja<Integer> inventarioNumeros = new InventarioCaja<>();
        inventarioNumeros.agregar(10);
        inventarioNumeros.agregar(45);
        inventarioNumeros.agregar(7);
        inventarioNumeros.agregar(88);
        inventarioNumeros.agregar(30);

        System.out.println("Inventario completo: " + inventarioNumeros);

        ArrayList<Integer> mayoresQue20 = inventarioNumeros.filtrarMayoresQue(20);
        System.out.println("Mayores que 20: " + mayoresQue20);

        System.out.println("\n=== InventarioCaja de texto ===");
        InventarioCaja<String> inventarioTextos = new InventarioCaja<>();
        inventarioTextos.agregar("Manzana");
        inventarioTextos.agregar("Pera");
        inventarioTextos.agregar("Durazno");
        inventarioTextos.agregar("Uva");

        ArrayList<String> mayoresQuePera = inventarioTextos.filtrarMayoresQue("Pera");
        System.out.println("Mayores (alfabéticamente) que 'Pera': " + mayoresQuePera);
    }
}
