package Collections.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.aplicarCambio("Hola");
        editor.aplicarCambio("Hola mundo");
        editor.aplicarCambio("Hola mundo, esto es Java");

        System.out.println("\nContenido actual: \"" + editor.getContenidoActual() + "\"");
        editor.mostrarHistorial();

        System.out.println("\nDeshaciendo un cambio...");
        editor.deshacer();
        System.out.println("Contenido actual: \"" + editor.getContenidoActual() + "\"");

        editor.mostrarHistorial();

        System.out.println("\nDeshaciendo todo lo que queda...");
        while (editor.cantidadCambios() > 0) {
            editor.deshacer();
        }

        System.out.println("\nContenido actual: \"" + editor.getContenidoActual() + "\"");
        editor.mostrarHistorial();

        System.out.println("\nIntentando deshacer sin cambios:");
        editor.deshacer();
    }
}
