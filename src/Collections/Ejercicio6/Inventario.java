package Collections.Ejercicio6;

import java.util.*;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar un nuevo producto (evitando códigos duplicados)
    public boolean agregarProducto(Producto nuevo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(nuevo.getCodigo())) {
                System.out.println("Ya existe un producto con el código " + nuevo.getCodigo());
                return false;
            }
        }
        productos.add(nuevo);
        return true;
    }

    // Eliminar productos agotados (stock <= 0)
    public int eliminarAgotados() {
        int eliminados = 0;
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            if (p.estaAgotado()) {
                it.remove();
                eliminados++;
            }
        }
        return eliminados;
    }

    // Buscar un producto específico por código
    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    // Buscar productos por nombre (coincidencia parcial)
    public ArrayList<Producto> buscarPorNombre(String textoBuscado) {
        ArrayList<Producto> resultados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getNombre().toLowerCase().contains(textoBuscado.toLowerCase())) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    // Listar todo el inventario en orden alfabético (por nombre)
    public void listarPorNombre() {
        ArrayList<Producto> copia = new ArrayList<>(productos);
        copia.sort(Comparator.comparing(Producto::getNombre, String.CASE_INSENSITIVE_ORDER));

        System.out.println("--- Inventario ordenado alfabéticamente ---");
        for (Producto p : copia) {
            System.out.println(p);
        }
    }

    // Listar todo el inventario ordenado por precio (de menor a mayor)
    public void listarPorPrecio() {
        ArrayList<Producto> copia = new ArrayList<>(productos);
        copia.sort(Comparator.comparingDouble(Producto::getPrecio));

        System.out.println("--- Inventario ordenado por precio ---");
        for (Producto p : copia) {
            System.out.println(p);
        }
    }

    public int totalProductos() {
        return productos.size();
    }
}
