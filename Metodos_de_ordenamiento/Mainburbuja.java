package Metodos_de_ordenamiento;

public class Mainburbuja {

    public static void main(String[] args) {
        // Usamos nuestro arreglo de ejemplo de clase
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("Arreglo original:");
        Burbuja.imprimirArreglo(arreglo);

        // Llamamos al método de ordenamiento
        Burbuja.ordenar(arreglo);

        System.out.println("Arreglo ordenado:");
        Burbuja.imprimirArreglo(arreglo);
    }
}
