package EstructuraDeDatos.Estructuras_Lineales;

public class PilaDinamica {
    Nodo cima; //Declarando un nodo llamado cima. El control remoto que apunta al elemento de hasta arriba

    // Constructor de la pila
    public PilaDinamica() {

        this.cima = null; // Arranca vacía
    }

    // Método PUSH (Meter elemento arriba)
    void push(int x) {
        Nodo nuevo = new Nodo(x); // 1. Creamos el nuevo nodo. Ojo tiene las mismas pripiedades que nodo.
        nuevo.siguiente = cima;   // 2. Como tiene las mismas propiedades que nodo no necesitamos llamar a la clase.
                                  // El nuevo atrapa al viejo de la cima
        cima = nuevo;             // 3. Actualizamos la cima. El nuevo se convierte oficialmente en la cima
    }
// nota: nuevo.siguiente es la flecha
    // Método POP (Sacar el elemento de arriba)
    void pop() {
        if (cima != null) {
            System.out.println("Sacaste de la pila: " + cima.dato);
            cima = cima.siguiente; // La cima se baja al siguiente nodo
        } else {
            System.out.println("¡Pila dinámica vacía!");
        }
    }

    // Método MOSTRAR (Recorriendo con el explorador)
    void mostrar() {
        Nodo actual = cima; // Nuestro explorador arranca en la cima
        System.out.print("Pila Dinámica (Cima -> Fondo): ");

        while (actual != null) { // Mientras no lleguemos al fondo (null)
            System.out.print(actual.dato + " ");
            actual = actual.siguiente; // Saltamos al siguiente nodo
        }
        System.out.println();// salto de linea
    }

    // Verificar si la cima no contiene nodos (A agregar)
    boolean isEmpty() {
        return cima == null;
    }

    // Consultar el valor de la cima SIN desvincular el nodo (A agregar)
    // Nota: no existe isFull(); la capacidad depende de la RAM disponible
    int peek() {
        if (isEmpty()) {
            System.out.println("¡Pila dinámica vacía, no hay elemento en la cima!");
            return -1; // Valor centinela: no hay nada que consultar
        }
        return cima.dato; // Solo se lee; la cima NO cambia
    }
}
