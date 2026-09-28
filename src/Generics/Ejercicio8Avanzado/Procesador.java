package Generics.Ejercicio8Avanzado;

/**
 * Clase que agrupa el método genérico procesar(). No guarda estado propio,
 * solo ofrece la operación de ejecutar y comparar dos elementos que cumplan
 * ambos contratos a la vez: Runnable (para poder llamar run()) y
 * Comparable<T> (para poder compararlos después).
 */
public class Procesador {

    /**
     * Ejecuta el run() de ambos elementos recibidos, y luego los compara
     * para determinar cuál tiene mayor prioridad (según su compareTo()).
     *
     * @param a   primer elemento, debe ser Runnable y Comparable
     * @param b   segundo elemento, debe ser Runnable y Comparable
     * @param <T> tipo que implementa tanto Runnable como Comparable<T>
     */
    public static <T extends Runnable & Comparable<T>> void procesar(T a, T b) {
        System.out.println("--- Ejecutando ambas tareas ---");
        a.run();
        b.run();

        System.out.println("--- Comparando resultados ---");
        int resultado = a.compareTo(b);

        if (resultado > 0) {
            System.out.println(a + " tiene mayor prioridad que " + b);
        } else if (resultado < 0) {
            System.out.println(b + " tiene mayor prioridad que " + a);
        } else {
            System.out.println(a + " y " + b + " tienen la misma prioridad");
        }
    }
}