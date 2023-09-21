package org.example;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    private static double[] coeficientes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Ecuación Cuadrática");

        int opcion;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ingresar coeficientes");
            System.out.println("2. Calcular soluciones");
            System.out.println("3. Calcular discriminante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    coeficientes = pedirCoeficientes();
                    break;
                case 2:
                    if (coeficientes != null) {
                        calcularSoluciones(coeficientes[0], coeficientes[1], coeficientes[2]);
                    } else {
                        System.out.println("Por favor, ingrese los coeficientes primero.");
                    }
                    break;
                case 3:
                    if (coeficientes != null) {
                        double discriminante = calcularDiscriminante(coeficientes[0], coeficientes[1], coeficientes[2]);
                        System.out.println("El discriminante es: " + discriminante);
                    } else {
                        System.out.println("Por favor, ingrese los coeficientes primero.");
                    }
                    break;
                case 4:
                    System.out.println("finalizado");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static double[] pedirCoeficientes() {
        Scanner scanner = new Scanner(System.in);
        double[] coeficientes = new double[3];

        System.out.print("Ingrese el coeficiente A: ");
        coeficientes[0] = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente B: ");
        coeficientes[1] = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente C: ");
        coeficientes[2] = scanner.nextDouble();

        return coeficientes;
    }

    public static void calcularSoluciones(double A, double B, double C) {
        double discriminante = calcularDiscriminante(A, B, C);

        if (discriminante > 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son reales y distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x1 = -B / (2 * A);
            System.out.println("La solución es una raíz doble:");
            System.out.println("x1 = x2 = " + x1);
        } else {
            double realPart = -B / (2 * A);
            double imaginaryPart = Math.sqrt(-discriminante) / (2 * A);
            System.out.println("Las soluciones son complejas:");
            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static double calcularDiscriminante(double A, double B, double C) {
        return B * B - 4 * A * C;
    }
}
