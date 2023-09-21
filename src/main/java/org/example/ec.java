package org.example;
import java.util.Scanner;

public class ec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Valor_puntos(scanner,"ingrese el valor de x1:");
        double y1 = Valor_puntos(scanner,"ingrese el valor de y1:");
        double x2 = Valor_puntos(scanner,"ingrese el valor de x2:");
        double y2 = Valor_puntos(scanner,"ingrese el valor de y2:");
        double m = Calcular_pendiente(x1, y1, x2, y2);
        double b = Calcular_b(x1,y1,m);
        ec_de_la_recta(m, b);
    }
    public static double Valor_puntos(Scanner scanner, String mensaje) {
        return scanner.nextDouble();

    }

    public static double Calcular_pendiente(double x1, double y1, double x2, double y2) {
        double pendiente = (y2-y1) / (x2-x1);
        return pendiente;
    }

    public static double Calcular_b (double x, double y, double pendiente) {
        double b = y - (pendiente * x);
        return b;
    }
    public static void ec_de_la_recta(double pendiente, double b){
        System.out.println("la ecuacion de la recta es: y = "+ pendiente + "x" + b );
    }

}
