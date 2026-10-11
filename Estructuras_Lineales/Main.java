package EstructuraDeDatos.Estructuras_Lineales;
public class Main {
    public static void main(String[] args) {
        PilaDinamica miPila = new PilaDinamica();

        System.out.println("¿Vacía? " + miPila.isEmpty());

        System.out.println("=== INSERTANDO ELEMENTOS (PUSH) ===");
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);
        miPila.mostrar(); // 30 20 10

        System.out.println("¿Vacía? " + miPila.isEmpty());
        System.out.println("Cima (peek): " + miPila.peek());
        miPila.mostrar(); // peek no elimina nada

        System.out.println("\n=== SACANDO ELEMENTOS (POP) ===");
        miPila.pop(); // Saca el 30
        miPila.mostrar();
        miPila.pop();
        miPila.pop();
        miPila.pop(); // Subdesbordamiento
        System.out.println("¿Vacía? " + miPila.isEmpty());
        miPila.peek();
    }
}
