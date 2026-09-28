package Generics.Ejercicio5Intermedio;

/**
 * Clase principal de prueba. Usa Comparador con distintos tipos que ya
 * implementan Comparable de fábrica (Integer, String), para comprobar
 * que mayor() y menor() funcionan igual sin importar el tipo de dato.
 */
public class Main {
    public static void main(String[] args) {

        Comparador<Integer> compEnteros = new Comparador<>();
        int mayorNumero = compEnteros.mayor(15, 42);
        System.out.println("El mayor entre 15 y 42 es: " + mayorNumero);

        Comparador<String> compTextos = new Comparador<>();
        String mayorTexto = compTextos.mayor("Manzana", "Pera");
        System.out.println("El mayor entre 'Manzana' y 'Pera' es: " + mayorTexto);

        String menorTexto = compTextos.menor("Manzana", "Pera");
        System.out.println("El menor entre 'Manzana' y 'Pera' es: " + menorTexto);
    }
}
