package Generics.Ejercicio10Enunciado;

import java.util.ArrayList;

/**
 * Clase principal de prueba. Apila varios enteros y usa extraerSi() con
 * distintos Predicate (escritos como expresiones lambda) para comprobar
 * que el filtrado respeta el límite 'max' y no modifica la pila original.
 */
public class Main {
    public static void main(String[] args) {

        PilaGenerica<Integer> pila = new PilaGenerica<>();
        pila.apilar(5);
        pila.apilar(12);
        pila.apilar(7);
        pila.apilar(20);
        pila.apilar(3);
        pila.apilar(18);

        System.out.println("Pila completa (cima primero): " + pila);
        System.out.println("Tamaño: " + pila.tamano());

        // Predicate como lambda: "el número es par"
        ArrayList<Integer> pares = pila.extraerSi(n -> n % 2 == 0, 3);
        System.out.println("\nHasta 3 números pares: " + pares);

        // Predicate como lambda: "el número es mayor que 10"
        ArrayList<Integer> mayoresQue10 = pila.extraerSi(n -> n > 10, 10);
        System.out.println("Todos los mayores que 10 (max 10): " + mayoresQue10);

        // Confirmamos que la pila original sigue intacta
        System.out.println("\nPila original después de extraerSi(): " + pila);
        System.out.println("Tamaño sigue siendo: " + pila.tamano());

        System.out.println("\nCima de la pila: " + pila.verCima());
        System.out.println("Desapilando: " + pila.desapilar());
        System.out.println("Pila después de desapilar: " + pila);
    }
}