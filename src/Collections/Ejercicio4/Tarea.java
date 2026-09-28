package Collections.Ejercicio4;

public class Tarea implements Comparable<Tarea> {
    private String nombre;
    private int prioridad; // por ejemplo: 1 = alta, 2 = media, 3 = baja

    public Tarea(String nombre, int prioridad) {
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
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return "Tarea: " + nombre + " (Prioridad: " + prioridad + ")";
    }
}
