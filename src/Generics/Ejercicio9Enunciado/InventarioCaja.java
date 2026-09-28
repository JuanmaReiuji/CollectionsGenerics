package Generics.Ejercicio9Enunciado;

import java.util.*;
/**
 * Clase genérica que almacena elementos de tipo T en una lista interna,
 * y permite filtrar los elementos mayores que un umbral dado. T debe
 * implementar Comparable<T> porque el filtro necesita poder comparar
 * cada elemento contra el umbral usando compareTo().
 *
 * @param <T> tipo de los elementos almacenados, debe implementar Comparable<T>
 * Enunciado No 1
 */
public class InventarioCaja<T extends Comparable<T>> {
    private ArrayList<T> elementos;

    public InventarioCaja() {
        elementos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo elemento al inventario.
     * @param item el elemento a guardar
     */
    public void agregar(T item) {
        elementos.add(item);
    }

    /**
     * Devuelve una nueva lista con los elementos estrictamente mayores
     * que el umbral dado, recorriendo la lista interna SOLO con Iterator
     * (sin usar for-each), tal como exige el enunciado.
     *
     * @param umbral el valor con el que se compara cada elemento
     * @return una nueva ArrayList con los elementos mayores que el umbral
     */
    public ArrayList<T> filtrarMayoresQue(T umbral) {
        ArrayList<T> resultado = new ArrayList<>();

        Iterator<T> it = elementos.iterator();
        while (it.hasNext()) {
            T actual = it.next();
            if (actual.compareTo(umbral) > 0) {
                resultado.add(actual);
            }
        }

        return resultado;
    }

    public int cantidadElementos() {
        return elementos.size();
    }

    @Override
    public String toString() {
        return "Inventario de caja" + elementos;
    }
}
