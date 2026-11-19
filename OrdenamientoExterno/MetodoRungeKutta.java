package OrdenamientoExterno;

public class MetodoRungeKutta {

    // f(x, y) = x + y
    public static double evaluarFuncion(double x, double y) {
        return x + y;
    }

    // Solucion analitica exacta de y' = x + y, y(0) = 1
    public static double solucionExacta(double x) {
        return 2 * Math.exp(x) - x - 1;
    }

    // Un paso de Runge-Kutta de 4to orden
    public static double pasoRK4(double x, double y, double h) {
        double k1 = evaluarFuncion(x, y);
        double k2 = evaluarFuncion(x + h / 2, y + h * k1 / 2);
        double k3 = evaluarFuncion(x + h / 2, y + h * k2 / 2);
        double k4 = evaluarFuncion(x + h, y + h * k3);
        return y + (h / 6) * (k1 + 2 * k2 + 2 * k3 + k4);
    }

    public static void main(String[] args) {
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.025;
        double xFinal = 0.3;

        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("h = " + h + "   N = " + nPasos);
        System.out.println("n\t x_n\t y_n (RK4)\t y_exacta\t error absoluto");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.8f\t %.8f\t %.2e\n", 0, x, y, solucionExacta(x), Math.abs(solucionExacta(x) - y));

        for (int i = 0; i < nPasos; i++) {
            y = pasoRK4(x, y, h);
            x = x0 + (i + 1) * h;
            double exacta = solucionExacta(x);
            double error = Math.abs(exacta - y);
            System.out.printf("%d\t %.4f\t %.8f\t %.8f\t %.2e\n", i + 1, x, y, exacta, error);
        }
    }
}