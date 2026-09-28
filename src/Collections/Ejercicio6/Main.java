package Collections.Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("P001", "Doritos", 2700, 10));
        inventario.agregarProducto(new Producto("P002", "Libra de arroz", 2000, 0));   // agotado
        inventario.agregarProducto(new Producto("P003", "Pepsi 2 Litros", 6000, 5));
        inventario.agregarProducto(new Producto("P004", "Chocolate", 1500, 0));        // agotado
        inventario.agregarProducto(new Producto("P005", "Agua", 1200, 20));

        System.out.println("Total de productos ingresados: " + inventario.totalProductos());

        System.out.println("\n=== Orden alfabético ===");
        inventario.listarPorNombre();

        System.out.println("\n=== Orden por precio ===");
        inventario.listarPorPrecio();

        System.out.println("\n=== Búsqueda por código (P003) ===");
        Producto encontrado = inventario.buscarPorCodigo("P003");
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        System.out.println("\n=== Eliminando agotados ===");
        int eliminados = inventario.eliminarAgotados();
        System.out.println("Se eliminaron " + eliminados + " producto(s) agotado(s).");

        System.out.println("\n=== Inventario final (por nombre) ===");
        inventario.listarPorNombre();
    }
}
