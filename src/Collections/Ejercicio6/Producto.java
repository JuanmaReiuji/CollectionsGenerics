package Collections.Ejercicio6;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(String codigo, String nombre, double precio, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public boolean estaAgotado() {
        return cantidadStock <= 0;
    }

    @Override
    public String toString() {
        return String.format("[%s] %-20s $%-10.2f Stock: %d", codigo, nombre, precio, cantidadStock);
    }
}