package ResolucionNumerica;

public class MetodoEuler {

    // f(x, y) = x - y
    public static double evaluarFuncion(double x, double y) {
        return x - y;
    }

    // Solucion analitica exacta de y' = x - y, y(0) = 1
    public static double solucionExacta(double x) {
        return x - 1 + 2 * Math.exp(-x);
    }

    // Un paso del metodo de Euler: y_{n+1} = y_n + h * f(x_n, y_n)
    public static double pasoEuler(double x, double y, double h) {
        double pendiente = evaluarFuncion(x, y);
        return y + h * pendiente;
    }

    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.01; // Variar este valor en el reporte (ej. 0.1, 0.05, 0.01)
        double xFinal = 0.3;

        // Criterio de paro (numero total de pasos N)
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("h = " + h + "   N = " + nPasos);
        System.out.println("n\t x_n\t y_n (Euler)\t y_exacta\t error absoluto");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f\n", 0, x, y, solucionExacta(x), Math.abs(solucionExacta(x) - y));

        for (int i = 0; i < nPasos; i++) {
            y = pasoEuler(x, y, h);
            x = x0 + (i + 1) * h; // evita acumular error de redondeo en x
            double exacta = solucionExacta(x);
            double error = Math.abs(exacta - y);
            System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f\n", i + 1, x, y, exacta, error);
        }
    }
}