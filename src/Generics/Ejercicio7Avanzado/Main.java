package Generics.Ejercicio7Avanzado;

/**
 * Clase principal de prueba. Crea varias EntidadPersistente con distintos
 * tipos numéricos, y usa comparar() para verificar cuál tiene el valor mayor.
 */
public class Main {
    public static void main(String[] args) {

        EntidadPersistente<Integer> entidadA = new EntidadPersistente<>(50);
        EntidadPersistente<Integer> entidadB = new EntidadPersistente<>(80);

        int resultado = entidadA.comparar(entidadB);
        if (resultado < 0) {
            System.out.println(entidadA + " es MENOR que " + entidadB);
        } else if (resultado > 0) {
            System.out.println(entidadA + " es MAYOR que " + entidadB);
        } else {
            System.out.println(entidadA + " es IGUAL que " + entidadB);
        }

        System.out.println();

        EntidadPersistente<Double> entidadC = new EntidadPersistente<>(19.99);
        System.out.println(entidadC + " como double: " + entidadC.valorComoDouble());
    }
}
