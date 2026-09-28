package Collections.Ejercicio7;

import java.util.LinkedList;

public class GestorTurnos {
    private LinkedList<String> colaClientes;

    public GestorTurnos() {
        colaClientes = new LinkedList<>();
    }

    // Agregar un cliente normal al final de la cola
    public void agregarCliente(String nombreCliente) {
        colaClientes.addLast(nombreCliente);
        System.out.println(nombreCliente + " se unió a la cola.");
    }

    // Insertar un cliente con urgencia, al inicio de la cola
    public void insertarUrgente(String nombreCliente) {
        colaClientes.addFirst(nombreCliente);
        System.out.println(nombreCliente + " fue insertado con URGENCIA al inicio de la cola.");
    }

    // Atender (y remover) al primer cliente de la cola
    public String atenderCliente() {
        if (colaClientes.isEmpty()) {
            System.out.println("No hay clientes en espera.");
            return null;
        }
        String atendido = colaClientes.removeFirst();
        System.out.println("Atendiendo a: " + atendido);
        return atendido;
    }

    // Ver quién sigue sin sacarlo de la cola
    public String verSiguiente() {
        return colaClientes.peekFirst();
    }

    public boolean colaVacia() {
        return colaClientes.isEmpty();
    }

    public int clientesEnEspera() {
        return colaClientes.size();
    }

    public void mostrarCola() {
        if (colaClientes.isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.println("Cola actual: " + colaClientes);
    }
}
