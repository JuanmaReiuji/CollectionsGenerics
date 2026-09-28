package Generics.Ejercicio4Intermedio;

/**
 * Clase principal de prueba. Crea distintas CajaNumerica con varios tipos
 * numéricos (Integer, Double) para comprobar que doble() funciona igual
 * en todos los casos, y demuestra que un tipo no numérico (como String)
 * ni siquiera compila.
 */
public class Main {
    public static void main(String[] args) {

        // --- CajaNumerica con Integer ---
        CajaNumerica<Integer> cajaEntero = new CajaNumerica<>(21);
        System.out.println(cajaEntero);
        System.out.println("El doble es: " + cajaEntero.doble());

        System.out.println();

        // --- CajaNumerica con Double ---
        CajaNumerica<Double> cajaDecimal = new CajaNumerica<>(7.5);
        System.out.println(cajaDecimal);
        System.out.println("El doble es: " + cajaDecimal.doble());

        System.out.println();

        // --- CajaNumerica con Long ---
        CajaNumerica<Long> cajaLarga = new CajaNumerica<>(1000000000L);
        System.out.println(cajaLarga);
        System.out.println("El doble es: " + cajaLarga.doble());

    }
}
