package Collections.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Tienda miTienda = new Tienda();
        Producto p1 = new Producto("A2", "Doritos", 2700);
        Producto p2 = new Producto("P4", "Libra de arroz", 2000);
        Producto p3 = new Producto("P24", "Pepsi 2 Litros", 6000);

        ///Agregando productos de prueba
        miTienda.agregarProducto(p1);
        miTienda.agregarProducto(p2);
        miTienda.agregarProducto(p3);

        ///Mostrando todos los productos actuales
        System.out.println("Productos en lista: ");
        miTienda.mostrarProductos();

        ///Buscar un producto que existe
        Producto encontrado = miTienda.buscarPorCodigo("A2");
        if (encontrado != null) {
            System.out.println(encontrado  + "\n Encontrado!!");
        } else {
            System.out.println("El producto no existe.");
        }





    }
}
