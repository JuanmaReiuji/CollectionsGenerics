package Collections.Ejercicio5;

public class Juego {
    private String codigo;
    private String titulo;
    private int anioLanzamiento;

    public Juego(String codigo, String titulo, int anioLanzamiento) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    @Override
    public String toString() {
        return "Juego: " + titulo + " (Codigo: " + codigo + ", Año: " + anioLanzamiento + ")";
    }
}
