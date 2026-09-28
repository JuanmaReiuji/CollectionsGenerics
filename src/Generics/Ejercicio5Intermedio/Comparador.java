package Generics.Ejercicio5Intermedio;

/**
 * Clase genérica que compara dos elementos y determina cuál es mayor.
 * El tipo T está restringido a Comparable<T>: solo acepta tipos que
 * sepan compararse consigo mismos (String, Integer, o cualquier clase
 * propia que implemente Comparable, como el Producto que ya hicimos).
 *
 * @param <T> el tipo de dato a comparar, debe implementar Comparable<T>
 * Nivel intermedio
 */
public class Comparador<T extends Comparable<T>> {

    /**
     * Devuelve el mayor entre dos elementos, usando su propio compareTo().
     *
     * @param a primer elemento a comparar
     * @param b segundo elemento a comparar
     * @return el mayor de los dos; si son iguales, devuelve a
     */
    public T mayor(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Devuelve el menor entre dos elementos, usando su propio compareTo().
     *
     * @param a primer elemento a comparar
     * @param b segundo elemento a comparar
     * @return el menor de los dos; si son iguales, devuelve a
     */
    public T menor(T a, T b) {
        if (a.compareTo(b) <= 0) {
            return a;
        } else {
            return b;
        }
    }
}
