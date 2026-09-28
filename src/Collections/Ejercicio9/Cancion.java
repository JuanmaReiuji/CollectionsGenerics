package Collections.Ejercicio9;

import java.util.Objects;

public class Cancion {
    private String titulo;
    private String artista;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    // Dos canciones son "la misma" si coinciden título y artista
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cancion otra = (Cancion) obj;
        return titulo.equalsIgnoreCase(otra.titulo) &&
                artista.equalsIgnoreCase(otra.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase(), artista.toLowerCase());
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" - " + artista;
    }
}
