package Collections.Ejercicio3;

import java.util.*;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // Dos libros se consideran "el mismo" si tienen el mismo título y autor
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;              // es literalmente el mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false; // no es un Libro, o es null
        Libro otro = (Libro) obj;
        return titulo.equalsIgnoreCase(otro.titulo) &&
                autor.equalsIgnoreCase(otro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase(), autor.toLowerCase());
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")";
    }
}

