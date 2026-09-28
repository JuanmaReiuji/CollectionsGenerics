package Generics.Ejercicio1Basico;
//Nivel basico

public class Caja<T> {
    private T contenido;

    public Caja() {
        this.contenido = null;
    }

    public void guardar(T valor) {
        this.contenido = valor;
        System.out.println("Guardado en la caja: " + valor);
    }

    public T obtener() {
        return contenido;
    }

    public boolean estaVacia() {
        return contenido == null;
    }

    @Override
    public String toString() {
        if (estaVacia()) {
            return "La caja vacía, de momento";
        }
        return "Caja: " + contenido;
    }
}
