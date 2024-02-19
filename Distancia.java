import java.util.Scanner;

public class Distancia {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    // Constructor privado por factory method
    private Distancia(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Factory method para utilizar en lugar de sobrecargar el constructor.
    public static Distancia from(double x1, double y1, double x2, double y2){
        return new Distancia(x1, y1, x2, y2);
    }

    public double calcularDistancia() {
        return Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
    }

    public double calcularPendiente() {
        if (x2 - x1 == 0) {
            // Pendiente indefinida
            return Double.POSITIVE_INFINITY;
        } else if (y2 - y1 == 0) {
            return 0;
        } else {
            return (y2 - y1) / (x2 - x1); //calcular pendiente
        }
    }

    public static double mensajeConsola(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}