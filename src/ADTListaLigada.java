
public class ADTListaLigada<T> {

    Nodo<T> head;
    int tamanio;

    public ADTListaLigada() {
        this.head = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal(int llave, T valor) {
        Nodo nuevo = new Nodo(llave, valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            Nodo aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        this.tamanio++;
    }

    public void agregarAlInicio(int llave, T valor) {
        Nodo nuevo = new Nodo(llave, valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            this.head = nuevo;
        }
        this.tamanio++;
    }

    public void agregarDespuesDe(int llave, T valor, int posicion) {
        Nodo nuevo = new Nodo(llave, valor);
        Nodo aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(nuevo);
        this.tamanio++;
    }

    public void eliminar(int posicion) {

        Nodo aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        this.tamanio--;
    }

    public void eliminarElPrimero() {
        if (this.estaVacia()) {
            System.out.println("La lista ya esta vacia");
        } else {
            Nodo aux = this.head;
            aux = aux.getSiguiente();
            head = aux;
        }
        this.tamanio--;
    }

    public void eliminarElFinal() {
        if (this.estaVacia()) {
            System.out.println("La lista ya esta vacia");
        } else {
            Nodo aux = this.head;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        this.tamanio--;
    }

    public int buscar(T valor) {
        int posicion = 1;
        Nodo aux = this.head;
        while (aux.getDato() != valor) {
            aux = aux.getSiguiente();
            posicion++;
        }
        return posicion - 1;
    }

    public void actualizar(T valorBuscado, T valor) {
        Nodo aux = this.head;
        while (aux.getDato() != valorBuscado) {
            aux = aux.getSiguiente();
        }
        aux.setDato(valor);
    }

    public void transversal() {
        Nodo curr_node = this.head;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }

    public T getValorLlave(int llave) {
        Nodo aux = this.head;
        while (aux.getLlave() != llave) {
            aux = aux.getSiguiente();
        }
        return (T) aux.getDato();
    }

    public T valorHead() {
        return this.head.getDato();
    }
}
