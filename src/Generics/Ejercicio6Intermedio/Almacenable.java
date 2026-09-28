package Generics.Ejercicio6Intermedio;

/**
 * Interfaz genérica que define el contrato para cualquier clase que
 * necesite almacenar elementos y llevar registro del mayor de ellos.
 * El tipo T está restringido a Comparable<T> porque calcular "el máximo"
 * requiere poder comparar los elementos entre sí.
 *
 * @param <T> el tipo de dato a almacenar, debe implementar Comparable<T>
 */
public interface Almacenable<T extends Comparable<T>> {

    /**
     * Guarda un nuevo elemento.
     * @param item el elemento a almacenar
     */
    void guardar(T item);

    /**
     * Devuelve el mayor elemento almacenado hasta el momento.
     * @return el elemento máximo, o null si no se ha guardado nada todavía
     */
    T maximo();
}
