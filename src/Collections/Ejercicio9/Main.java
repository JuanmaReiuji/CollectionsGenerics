package Collections.Ejercicio9;

public class Main {
    public static void main(String[] args) {
        ListaFavs favoritos = new ListaFavs();

        favoritos.marcarFavorita(new Cancion("Lunar Abyss", "Lchavasse"));
        favoritos.marcarFavorita(new Cancion("Solar Sect of Mystic Wisdom ~ Nuclear Fusion", "ZUN"));
        favoritos.marcarFavorita(new Cancion("Rockport Nights", "Junkie XL"));

        System.out.println("\nIntentando agregar un duplicado:");
        favoritos.marcarFavorita(new Cancion("Solar sect of Mystic wisdom ~ nuclear fusion", "ZUN")); // mismo, distinta mayúscula

        System.out.println();
        favoritos.mostrarFavoritas();

        System.out.println("\n¿'Stereo Madness' es favorita? " + favoritos.esFavorita(new Cancion("Stereo Madness", "RobTop")));

        System.out.println("\nQuitando una canción:");
        favoritos.quitarFavorita(new Cancion("Rockport Nights", "Junkie XL"));

        System.out.println();
        favoritos.mostrarFavoritas();

        System.out.println("\nTotal de favoritas: " + favoritos.totalFavoritas());
    }
}