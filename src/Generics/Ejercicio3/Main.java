package Generics.Ejercicio3;

/**
 * Clase principal de prueba. Crea distintos pares (de String, de Integer,
 * y con valores repetidos) para comprobar el funcionamiento de sonIguales()
 * e intercambiar() con distintos tipos de datos.
 */
public class Main {
    public static void main(String[] args) {

        // --- Par de String, valores distintos ---
        Par<String> parTexto = new Par<>("Hola", "Mundo");
        System.out.println("Par de texto: " + parTexto);
        System.out.println("¿Son iguales? " + parTexto.sonIguales());

        // --- Par de String, valores iguales ---
        Par<String> parTextoIgual = new Par<>("Java", "Java");
        System.out.println("\nPar de texto igual: " + parTextoIgual);
        System.out.println("¿Son iguales? " + parTextoIgual.sonIguales());

        // --- Par de Integer ---
        Par<Integer> parNumeros = new Par<>(10, 25);
        System.out.println("\nPar de números: " + parNumeros);
        System.out.println("¿Son iguales? " + parNumeros.sonIguales());

        // --- Probando intercambiar() ---
        System.out.println("\nIntercambiando el par de números...");
        parNumeros.intercambiar();
        System.out.println("Después de intercambiar: " + parNumeros);

        // --- Usando los setters para modificar el par ---
        parNumeros.setPrimero(25);
        System.out.println("\nDespués de setPrimero(25): " + parNumeros);
        System.out.println("¿Son iguales ahora? " + parNumeros.sonIguales());
    }
}