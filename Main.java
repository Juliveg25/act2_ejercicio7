import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Distancia.mensajeConsola(scanner, "Ingrese el punto x1: ");
        double y1 = Distancia.mensajeConsola(scanner, "Ingrese el punto y1: ");
        scanner.nextLine();

        double x2 = Distancia.mensajeConsola(scanner, "Ingrese el punto x2: ");
        double y2 = Distancia.mensajeConsola(scanner, "Ingrese el punto y2: ");
        scanner.nextLine();

        System.out.println("La distancia entre los puntos es: " + Distancia.from(x1, y1, x2, y2).calcularDistancia());

        double slope = Distancia.from(x1, y1, x2, y2).calcularPendiente();
        if (Double.isInfinite(slope)) {
            System.out.println("La pendiente es indefinida para líneas verticales");
        } else {
            System.out.println("La pendiente de la línea es: " + slope);
        }
        scanner.close();
    }
}
