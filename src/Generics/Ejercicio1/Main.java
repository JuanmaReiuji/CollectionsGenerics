package Generics.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        // Caja que guarda un String
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Geometry Dash");
        String texto = cajaTexto.obtener(); // sin cast
        System.out.println("Contenido: " + texto);
        System.out.println(cajaTexto);

        System.out.println();

        // Caja que guarda un Integer
        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(2013);
        int numero = cajaNumero.obtener(); // sin cast, y con unboxing automático
        System.out.println("Contenido: " + numero);
        System.out.println(cajaNumero);

        System.out.println();
    }
}
