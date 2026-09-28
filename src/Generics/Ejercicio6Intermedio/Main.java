package Generics.Ejercicio6Intermedio;

/**
 * Clase principal de prueba. Usa AlmacenNumeros con Integer y con String
 * para comprobar que el cálculo del máximo se actualiza correctamente
 * a medida que se van guardando elementos, sin importar el tipo de dato.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Almacén de enteros ===");
        AlmacenNumeros<Integer> almacenEnteros = new AlmacenNumeros<>();
        almacenEnteros.guardar(15);
        almacenEnteros.guardar(42);
        almacenEnteros.guardar(8);
        almacenEnteros.guardar(99);
        almacenEnteros.guardar(30);

        System.out.println("\nMáximo final: " + almacenEnteros.maximo());
        System.out.println("Total de elementos guardados: " + almacenEnteros.cantidadElementos());
        System.out.println(almacenEnteros);

        System.out.println("\n=== Almacén de texto ===");
        AlmacenNumeros<String> almacenTextos = new AlmacenNumeros<>();
        almacenTextos.guardar("Manzana");
        almacenTextos.guardar("Pera");
        almacenTextos.guardar("Durazno");
        almacenTextos.guardar("Uva");

        System.out.println("\nMáximo final: " + almacenTextos.maximo());
    }
}
