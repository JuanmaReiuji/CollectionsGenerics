package Generics.Ejercicio2Basico;

/**
 * Clase que agrupa métodos genéricos de utilidad para el manejo de arreglos.
 * No guarda estado propio (no tiene atributos ni constructor relevante),
 * solo ofrece métodos estáticos reutilizables para cualquier tipo de dato.
 * Nivel basico
 */
public class Utilidades {

    /**
     * Intercambia las posiciones de dos elementos dentro de un arreglo genérico.
     * Funciona sin importar el tipo de dato que contenga el arreglo (String,
     * Integer, o cualquier clase propia), gracias al parámetro de tipo T.
     *
     * @param arreglo   el arreglo donde se va a hacer el intercambio
     * @param indiceA   posición del primer elemento a intercambiar
     * @param indiceB   posición del segundo elemento a intercambiar
     * @param <T>       el tipo de dato que contiene el arreglo
     */
    public static <T> void intercambiar(T[] arreglo, int indiceA, int indiceB) {
        // Validamos que los índices existan dentro del arreglo antes de tocar nada
        if (indiceA < 0 || indiceA >= arreglo.length || indiceB < 0 || indiceB >= arreglo.length) {
            System.out.println("Índice fuera de rango. No se realizó el intercambio.");
            return;
        }

        T temporal = arreglo[indiceA];
        arreglo[indiceA] = arreglo[indiceB];
        arreglo[indiceB] = temporal;
    }

    /**
     * Método auxiliar para imprimir el contenido completo de un arreglo genérico,
     * separado por comas. Sirve para ver el "antes" y "después" del intercambio.
     *
     * @param arreglo el arreglo a mostrar
     * @param <T>     el tipo de dato que contiene el arreglo
     */
    public static <T> void mostrarArreglo(T[] arreglo) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
