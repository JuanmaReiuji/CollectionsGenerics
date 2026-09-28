package Generics.Ejercicio10Enunciado;

import java.util.*;
import java.util.function.Predicate;

/**
 * Pila genérica respaldada por una LinkedList (usando addFirst/removeFirst
 * para simular el comportamiento LIFO de una pila real, tal como Stack).
 * Además de las operaciones básicas de pila, ofrece extraerSi(), que permite
 * consultar hasta un número máximo de elementos que cumplan una condición,
 * sin alterar el contenido ni el orden de la pila original.
 *
 * @param <T> tipo de los elementos almacenados
 * Enunciado 6
 */
public class PilaGenerica<T> {
    private LinkedList<T> pila;

    public PilaGenerica() {
        pila = new LinkedList<>();
    }

    public void apilar(T elemento) {
        pila.addFirst(elemento);
    }

    public T desapilar() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        return pila.removeFirst();
    }

    public T verCima() {
        return pila.peekFirst();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public int tamano() {
        return pila.size();
    }

    /**
     * Recorre la pila (de la cima hacia la base) usando SOLO Iterator, y
     * devuelve una nueva lista con hasta 'max' elementos que cumplan la
     * condición 'p'. La pila original no se modifica en absoluto: solo se
     * consulta, nunca se hace pop() ni remove() durante el recorrido.
     *
     * @param p   la condición que debe cumplir cada elemento (Predicate)
     * @param max cantidad máxima de elementos a devolver
     * @return una nueva lista con los elementos que cumplieron la condición
     */
    public ArrayList<T> extraerSi(Predicate<T> p, int max) {
        ArrayList<T> resultado = new ArrayList<>();

        Iterator<T> it = pila.iterator();
        while (it.hasNext() && resultado.size() < max) {
            T actual = it.next();
            if (p.test(actual)) {
                resultado.add(actual);
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Pila Generica: " + pila;
    }
}
