package Collections.Ejercicio9;


import java.util.LinkedHashSet;
import java.util.Set;

public class ListaFavs {
    private LinkedHashSet<Cancion> favoritas;

    public ListaFavs() {
        favoritas = new LinkedHashSet<>();
    }

    // Intenta marcar una canción como favorita
    public boolean marcarFavorita(Cancion cancion) {
        boolean agregada = favoritas.add(cancion);
        if (agregada) {
            System.out.println("Agregada a favoritos: " + cancion);
        } else {
            System.out.println("Ya estaba en favoritos: " + cancion);
        }
        return agregada;
    }

    // Quitar una canción de favoritos
    public boolean quitarFavorita(Cancion cancion) {
        boolean eliminada = favoritas.remove(cancion);
        if (eliminada) {
            System.out.println("Eliminada de favoritos: " + cancion);
        } else {
            System.out.println("No estaba en favoritos: " + cancion);
        }
        return eliminada;
    }

    public boolean esFavorita(Cancion cancion) {
        return favoritas.contains(cancion);
    }

    public void mostrarFavoritas() {
        if (favoritas.isEmpty()) {
            System.out.println("No hay canciones favoritas todavía.");
            return;
        }
        System.out.println("Favoritas (en orden de inserción):");
        int contador = 1;
        for (Cancion c : favoritas) {
            System.out.println("  " + contador + ". " + c);
            contador++;
        }
    }

    public int totalFavoritas() {
        return favoritas.size();
    }
}