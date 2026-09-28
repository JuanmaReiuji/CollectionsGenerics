package Generics.Ejercicio7Avanzado;

/**
 * Clase genérica que almacena un valor numérico y permite compararlo con
 * otros valores del mismo tipo. A diferencia de CajaNumerica (que solo exigía
 * Number) o Comparador (que solo exigía Comparable), aquí T debe cumplir
 * AMBAS condiciones a la vez: ser un número Y saber compararse consigo mismo.
 *
 * @param <T> tipo del valor almacenado; debe extender Number e implementar Comparable<T>
 * Nivel avanzado
 */
public class EntidadPersistente<T extends Number & Comparable<T>> {
    private T valor;

    public EntidadPersistente(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    /**
     * Compara el valor de esta entidad contra el de otra.
     * @param otra la otra entidad a comparar
     * @return negativo si esta es menor, cero si son iguales, positivo si esta es mayor
     */
    public int comparar(EntidadPersistente<T> otra) {
        return this.valor.compareTo(otra.valor);
    }

    /**
     * Ejemplo de uso de la restricción Number: obtiene el valor como double,
     * sin importar si T era originalmente Integer, Double, Long, etc.
     */
    public double valorComoDouble() {
        return valor.doubleValue();
    }

    @Override
    public String toString() {
        return "Entidad persistente: " + valor;
    }
}
