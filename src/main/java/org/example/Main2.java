package org.example;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Resolución de un Sistema de Ecuaciones de 2x2");
        System.out.println("El sistema tiene la forma:");
        System.out.println("Ax + By = C");
        System.out.println("Dx + Ey = F");

        double A = 0, B = 0, C = 0, D = 0, E = 0, F = 0; // Inicialización con valores por defecto

        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ingresar coeficientes");
            System.out.println("2. Calcular solución");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double[] coeficientes = pedirCoeficientes(scanner);
                    A = coeficientes[0];
                    B = coeficientes[1];
                    C = coeficientes[2];
                    D = coeficientes[3];
                    E = coeficientes[4];
                    F = coeficientes[5];
                    break;
                case 2:
                    if (A != 0) {
                        calcularSolucion(A, B, C, D, E, F);
                    } else {
                        System.out.println("El sistema no tiene una solución única.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static double[] pedirCoeficientes(Scanner scanner) {
        double[] coeficientes = new double[6];

        System.out.println("Ingrese los coeficientes y constantes:");

        System.out.print("A: ");
        coeficientes[0] = scanner.nextDouble();
        System.out.print("B: ");
        coeficientes[1] = scanner.nextDouble();
        System.out.print("C: ");
        coeficientes[2] = scanner.nextDouble();
        System.out.print("D: ");
        coeficientes[3] = scanner.nextDouble();
        System.out.print("E: ");
        coeficientes[4] = scanner.nextDouble();
        System.out.print("F: ");
        coeficientes[5] = scanner.nextDouble();

        return coeficientes;
    }

    public static void calcularSolucion(double A, double B, double C, double D, double E, double F) {
        double determinante = A * E - B * D;
        double x = (C * E - B * F) / determinante;
        double y = (A * F - C * D) / determinante;

        System.out.println("La solución del sistema es:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
