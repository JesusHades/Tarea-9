
import java.util.ArrayList;

public class ADTArray<T> {

    private int tamanio;
    private ArrayList<T> datos;

    public ADTArray(int tamanio) {
        this.tamanio = tamanio;
        datos = new ArrayList<>();
        for (int j = 0; j < tamanio; j++) {
            datos.add(null);
        }
    }

    public int getLongitud() {
        return tamanio;
    }

    public void setElemento(int indice, T Elemento) {
        if (indice >= 0 && indice < this.tamanio) {
            datos.set(indice, Elemento);
        }
    }

    public T getElemento(int indice) {
        if (indice >= 0 && indice < this.tamanio) {
            return datos.get(indice);
        }
        return null;
    }

    public void limpiar(T dato) {
        for (int i = 0; i < tamanio; i++) {
            datos.set(i, dato);
        }
    }

    public String toString() {
        return " + [datos.toString()]";
    }
}
