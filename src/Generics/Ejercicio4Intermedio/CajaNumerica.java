package Generics.Ejercicio4Intermedio;

/**
 * Clase genérica que almacena un número y permite obtener el doble de su valor.
 * A diferencia de Caja<T> (que aceptaba absolutamente cualquier tipo), aquí
 * el tipo T está restringido: solo se aceptan tipos que sean subclases de
 * Number (Integer, Double, Float, Long, etc.), porque necesitamos poder
 * hacer operaciones matemáticas con el valor guardado.
 *
 * @param <T> el tipo numérico que va a contener la caja (debe extender Number)
 */
public class CajaNumerica<T extends Number> {
    private T numero;

    public CajaNumerica(T numero) {
        this.numero = numero;
    }

    public T getNumero() {
        return numero;
    }

    public void setNumero(T numero) {
        this.numero = numero;
    }

    /**
     * Calcula el doble del valor almacenado.
     * Se devuelve como double para poder representar correctamente
     * el resultado sin importar si T era Integer, Double, Long, etc.
     *
     * @return el valor almacenado multiplicado por dos
     */
    public double doble() {
        return numero.doubleValue() * 2;
    }

    @Override
    public String toString() {
        return "CajaNumerica[" + numero + "]";
    }
}
