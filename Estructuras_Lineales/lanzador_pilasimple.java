package EstructuraDeDatos.Estructuras_Lineales;

public class lanzador_pilasimple {
    public static void main(String[] args) {
        PilaSimple p = new PilaSimple();

        System.out.println("¿Vacía? " + p.isEmpty());

        p.push(10);
        p.push(20);
        p.push(30);
        p.push(40);
        p.push(50);
        p.push(60); // Desbordamiento: la capacidad es 5
        p.mostrar();

        System.out.println("¿Llena? " + p.isFull());
        System.out.println("Cima (peek): " + p.peek());
        p.mostrar(); // peek no elimina nada

        p.pop(); // Saca el 50
        p.mostrar();
        System.out.println("¿Llena? " + p.isFull());

        // Vaciar la pila y provocar subdesbordamiento
        p.pop();
        p.pop();
        p.pop();
        p.pop();
        p.pop();
        System.out.println("¿Vacía? " + p.isEmpty());
        p.peek();
    }
}
