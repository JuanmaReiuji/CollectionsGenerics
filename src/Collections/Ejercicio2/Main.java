package Collections.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        MiPila miPila = new MiPila();

        miPila.apilar(567);           // Integer -> se acepta (pila vacía)
        miPila.apilar("Mundo");       // String -> NO coincide, se rechaza
        miPila.apilar(42);            // Integer -> coincide, se acepta
        miPila.apilar("Java");        // String -> NO coincide, se rechaza

        System.out.println("\nTamaño actual de la pila: " + miPila.tamano());
        System.out.println("Elemento en la cima: " + miPila.verCima());

        System.out.println("\nDesapilando todo:");
        while (!miPila.estaVacia()) {
            System.out.println(miPila.desapilar());
        }

        System.out.println("Vamos a apilar nuevamente pero al reves, aceptando Strings");
        miPila.apilar("Hola");        // String -> se acepta (pila vacía)
        miPila.apilar("Mundo");       // String -> coincide, se acepta
        miPila.apilar(42);            // Integer -> NO coincide, se rechaza
        miPila.apilar("Java");        // String -> coincide, se acepta

        System.out.println("\nTamaño actual de la pila: " + miPila.tamano());
        System.out.println("Elemento en la cima: " + miPila.verCima());

        System.out.println("\nDesapilando todo:");
        while (!miPila.estaVacia()) {
            System.out.println(miPila.desapilar());


        }
    }
}
