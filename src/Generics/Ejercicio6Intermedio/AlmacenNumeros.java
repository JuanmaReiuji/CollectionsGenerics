package Generics.Ejercicio6Intermedio;

import java.util.ArrayList;

/**
 * Implementación de Almacenable que guarda todos los elementos recibidos
 * y mantiene actualizado, en todo momento, cuál es el mayor de ellos,
 * sin necesidad de recorrer toda la lista cada vez que se pregunta.
 *
 * @param <T> el tipo de dato a almacenar, debe implementar Comparable<T>
 * Nivel intermedio
 */
public class AlmacenNumeros<T extends Comparable<T>> implements Almacenable<T> {
    private ArrayList<T> elementos;
    private T mayorActual;

    public AlmacenNumeros() {
        elementos = new ArrayList<>();
        mayorActual = null;
    }

    /*
    Se uso una analogia a la recursividad en cola, ya que al igual que cola, vamos almcenando
    el resutado al momento, en vez de solo esperar, aqui es igual: agregamos y de una vez comparamos
    si el agregado es mayor al maximo actual, se lo asginamos tambien a una variable que permite tener
    a la mano el maximo actual sin recorrer la lista completa
     */
    @Override
    public void guardar(T item) {
        elementos.add(item);

        if (mayorActual == null || item.compareTo(mayorActual) > 0) {
            mayorActual = item;
        }

        System.out.println("Guardado: " + item + " (máximo actual: " + mayorActual + ")");
    }

    @Override
    public T maximo() {
        return mayorActual;
    }

    public int cantidadElementos() {
        return elementos.size();
    }

    @Override
    public String toString() {
        return "AlmacenNumeros" + elementos;
    }
}
