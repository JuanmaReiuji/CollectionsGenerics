package Collections.Ejercicio1;

import java.util.*;

public class Tienda {
    private Set<Producto> listaProductos;

    public Tienda() {
        this.listaProductos = new TreeSet<>();
    }

    public boolean agregarProducto(Producto n) {
        return listaProductos.add(n);
    }

    public Producto buscarPorCodigo(String codigoBuscar){
        for (Producto aux : listaProductos) {
            if (aux.getCodigo().equalsIgnoreCase(codigoBuscar)) {
                return aux;
            }
        }
        return null;
    }


    public void mostrarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        }
        for (Producto p : listaProductos) {
            System.out.println(p);
        }
    }

}