package Collections.Ejercicio5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ---------- HashMap ----------
        Map<String, Juego> mapaHash = new HashMap<>();
        mapaHash.put("G01", new Juego("G01", "Geometry Dash", 2013));
        mapaHash.put("G02", new Juego("G02", "Touhou", 1996));
        mapaHash.put("G03", new Juego("G03", "Need for Speed Most Wanted", 2005));

        System.out.println("===== HashMap (sin orden garantizado) =====");
        for (Map.Entry<String, Juego> entry : mapaHash.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------- LinkedHashMap ----------
        Map<String, Juego> mapaLinked = new LinkedHashMap<>();
        mapaLinked.put("G03", new Juego("G03", "Need for Speed Most Wanted", 2005));
        mapaLinked.put("G01", new Juego("G01", "Geometry Dash", 2013));
        mapaLinked.put("G02", new Juego("G02", "Touhou", 1996));

        System.out.println("\n===== LinkedHashMap (orden de inserción) =====");
        for (Map.Entry<String, Juego> entry : mapaLinked.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------- TreeMap ----------
        Map<String, Juego> mapaTree = new TreeMap<>();
        mapaTree.put("G03", new Juego("G03", "Need for Speed Most Wanted", 2005));
        mapaTree.put("G01", new Juego("G01", "Geometry Dash", 2013));
        mapaTree.put("G02", new Juego("G02", "Touhou", 1996));

        System.out.println("\n===== TreeMap (orden natural de la clave) =====");
        for (Map.Entry<String, Juego> entry : mapaTree.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------- Búsqueda directa por clave ----------
        System.out.println("\nBuscando G01 en el TreeMap: " + mapaTree.get("G01"));
    }
}
