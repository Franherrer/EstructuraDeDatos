package Metodos_de_ordenamiento;

public class QuickSort {
    /**
     * @param arr  Arreglo de enteros a ordenar.
     * @param bajo Índice inicial del subarreglo (usualmente 0).
     * @param alto Índice final del subarreglo (usualmente arr.length - 1).
     */
    public static void ordenar(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            // 1. Particionamiento: Obtenemos la posición definitiva del pivote
            int pivote = particionar(arr, bajo, alto);

            // 2. Llamada recursiva para la sub-lista izquierda (menores al pivote)
            ordenar(arr, bajo, pivote - 1);

            // 3. Llamada recursiva para la sub-lista derecha (mayores al pivote)
            ordenar(arr, pivote + 1, alto);
        }
    }

    /**
     * Método de partición (Esquema de Lomuto).
     * Toma el último elemento como pivote y reorganiza el arreglo para que
     * los menores queden a la izquierda y los mayores a la derecha.
     */
    private static int particionar(int[] arr, int bajo, int alto) {
        // Elegimos el último elemento como valor del pivote
        int valorPivote = arr[alto];

        // Índice del elemento más pequeño (delimita la frontera de los menores)
        int i = (bajo - 1);

        // Recorremos desde 'bajo' hasta 'alto - 1'
        for (int j = bajo; j < alto; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= valorPivote) {
                i++; // Avanzamos la frontera de los menores

                // Intercambio (swap) clásico usando variable temporal
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Finalmente, colocamos el pivote en su posición correcta (entre los menores y los mayores)
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        // Retornamos el índice exacto donde quedó ubicado el pivote
        return i + 1;
    }

    /**
     * Método auxiliar para imprimir los elementos del arreglo.
     */
    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
