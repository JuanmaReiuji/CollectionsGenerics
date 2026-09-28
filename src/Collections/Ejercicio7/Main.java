package Collections.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        GestorTurnos banco = new GestorTurnos();

        banco.agregarCliente("Ana");
        banco.agregarCliente("Luis");
        banco.agregarCliente("Marta");

        banco.mostrarCola();

        System.out.println("\nSiguiente en atenderse: " + banco.verSiguiente());
        banco.atenderCliente(); // atiende a Ana

        banco.mostrarCola();

        System.out.println("\nLlega un cliente con urgencia (adulto mayor, emergencia, etc.)");
        banco.insertarUrgente("Don José (urgente)");

        banco.mostrarCola();

        System.out.println("\nSe sigue atendiendo en orden:");
        while (!banco.colaVacia()) {
            banco.atenderCliente();
        }

        banco.mostrarCola();
    }
}