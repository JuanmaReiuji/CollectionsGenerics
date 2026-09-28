package Generics.Ejercicio3;

/**
 * Clase genérica que representa un par de valores del mismo tipo.
 * Útil para agrupar dos elementos relacionados sin necesidad de crear
 * una clase específica para cada combinación de tipos (par de String,
 * par de Integer, etc.) — la misma clase Par sirve para cualquier tipo T.
 *
 * @param <T> el tipo de dato que van a tener ambos valores del par
 * nivel basico
 */
public class Par<T> {
    private T primero;
    private T segundo;

    /**
     * Crea un nuevo par con los dos valores indicados.
     *
     * @param primero  el primer valor del par
     * @param segundo  el segundo valor del par
     */
    public Par(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public T getSegundo() {
        return segundo;
    }

    public void setSegundo(T segundo) {
        this.segundo = segundo;
    }

    /**
     * Verifica si ambos valores del par son iguales entre sí,
     * usando el equals() propio del tipo T que se esté usando.
     *
     * @return true si primero y segundo son considerados iguales, false en caso contrario
     */
    public boolean sonIguales() {
        if (primero == null || segundo == null) {
            return primero == segundo; // true solo si ambos son null
        }
        return primero.equals(segundo);
    }

    /**
     * Intercambia los valores de primero y segundo entre sí.
     */
    public void intercambiar() {
        T temporal = primero;
        primero = segundo;
        segundo = temporal;
    }

    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }
}
