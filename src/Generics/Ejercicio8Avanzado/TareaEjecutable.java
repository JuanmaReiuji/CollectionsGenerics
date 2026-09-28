package Generics.Ejercicio8Avanzado;

/**
 * Clase de ejemplo que representa una tarea con una prioridad numérica.
 * Implementa Runnable (sabe "ejecutarse" mediante run()) y Comparable
 * (sabe compararse con otra tarea del mismo tipo, según su prioridad).
 * Es necesaria porque el método procesar() exige un tipo que cumpla AMBOS
 * contratos a la vez.
 * Nivel avanzado
 */
public class TareaEjecutable implements Runnable, Comparable<TareaEjecutable> {
    private String nombre;
    private int prioridad;

    public TareaEjecutable(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public void run() {
        System.out.println("Ejecutando tarea: " + nombre + " (prioridad: " + prioridad + ")");
    }

    @Override
    public int compareTo(TareaEjecutable otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return nombre + " [prioridad " + prioridad + "]";
    }
}