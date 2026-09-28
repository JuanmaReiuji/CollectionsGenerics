package Collections.Ejercicio4;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tarea> colaTareas = new PriorityQueue<>();

        colaTareas.add(new Tarea("Lavar mancha de cafe en el baño", 1));
        colaTareas.add(new Tarea("Hacer trabajos de Uni", 3));
        colaTareas.add(new Tarea("Ordenar cuarto", 2));
        colaTareas.add(new Tarea("Recoger dinero de papá", 50));
        colaTareas.add(new Tarea("Jugar GD", -1));

        System.out.println("Procesando tareas por prioridad:");
        while (!colaTareas.isEmpty()) {
            Tarea siguiente = colaTareas.poll();
            System.out.println(siguiente);
        }
    }
}
