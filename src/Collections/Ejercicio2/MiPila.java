package Collections.Ejercicio2;

import java.util.Stack;
import java.util.EmptyStackException;

public class MiPila {
    private Stack<Object> pila;

    public MiPila() {
        pila = new Stack<>();
    }

    public boolean apilar(Object elemento) {
        if (elemento == null) {
            System.out.println("No se permite apilar elementos null.");
            return false;
        }

        if (pila.isEmpty()) {
            pila.push(elemento);
            System.out.println("Apilado (pila vacía): " + elemento + " [" + elemento.getClass().getSimpleName() + "]");
            return true;
        }

        Object cima = pila.peek();

        if (elemento.getClass().equals(cima.getClass())) {
            pila.push(elemento);
            System.out.println("Apilado: " + elemento + " [" + elemento.getClass().getSimpleName() + "]");
            return true;
        } else {
            System.out.println("Rechazado: " + elemento + " [" + elemento.getClass().getSimpleName() +
                    "] no coincide con el tipo de la cima [" + cima.getClass().getSimpleName() + "]");
            return false;
        }
    }

    public Object desapilar() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía, no se puede desapilar.");
            return null;
        }
        return pila.pop();
    }

    public Object verCima() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.peek();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public int tamano() {
        return pila.size();
    }
}
