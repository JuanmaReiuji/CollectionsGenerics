package Collections.Ejercicio8;

import java.util.Vector;

public class EditorTexto {
    private Vector<String> historialCambios;
    private String contenidoActual;

    public EditorTexto() {
        historialCambios = new Vector<>();
        contenidoActual = "";
    }

    // Aplica un cambio nuevo y lo registra en el historial
    public void aplicarCambio(String nuevoContenido) {
        historialCambios.add(nuevoContenido);
        contenidoActual = nuevoContenido;
        System.out.println("Cambio aplicado: \"" + nuevoContenido + "\"");
    }

    // Deshace el último cambio, eliminándolo del historial
    public boolean deshacer() {
        if (historialCambios.isEmpty()) {
            System.out.println("No hay cambios para deshacer.");
            return false;
        }

        int ultimoIndice = historialCambios.size() - 1;
        String cambioDeshecho = historialCambios.remove(ultimoIndice);
        System.out.println("Deshaciendo: \"" + cambioDeshecho + "\"");

        if (historialCambios.isEmpty()) {
            contenidoActual = "";
        } else {
            contenidoActual = historialCambios.lastElement();
        }

        return true;
    }

    public String getContenidoActual() {
        return contenidoActual;
    }

    public void mostrarHistorial() {
        if (historialCambios.isEmpty()) {
            System.out.println("El historial está vacío.");
            return;
        }
        System.out.println("Historial de cambios:");
        for (int i = 0; i < historialCambios.size(); i++) {
            System.out.println("  " + i + ". " + historialCambios.get(i));
        }
    }

    public int cantidadCambios() {
        return historialCambios.size();
    }
}
