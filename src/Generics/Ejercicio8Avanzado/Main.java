package Generics.Ejercicio8Avanzado;

/**
 * Clase principal de prueba. Crea dos TareaEjecutable con distinta prioridad
 * y las pasa a Procesador.procesar(), que las ejecuta y luego las compara.
 */
public class Main {
    public static void main(String[] args) {
        TareaEjecutable tarea1 = new TareaEjecutable("Enviar correo", 3);
        TareaEjecutable tarea2 = new TareaEjecutable("Respaldo de datos", 7);

        Procesador.procesar(tarea1, tarea2);
    }
}
