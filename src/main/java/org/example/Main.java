package org.example;
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        Scanner form = new Scanner(System.in);

        System.out.println("Fórmula Cuadrática: Ax2 + Bx + C = 0");

        double a, b, c;

        System.out.println("Escriba el numero A");
        a = form.nextDouble();

        System.out.println("Escriba el numero B");
        b = form.nextDouble();

        System.out.println("Escriba el numero C?");
        c = form.nextDouble();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        ecuacion.calcularSoluciones();
        ecuacion.calcularDeterminate();
    }
}

class EcuacionCuadratica {
    double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calcularSoluciones() {
        double potencia;
        potencia = Math.pow(b, 2) - (4 * a * c);

        double x1 = (-b - Math.sqrt(potencia)) / (2 * a);
        double x2 = (-b + Math.sqrt(potencia)) / (2 * a);

        System.out.println("Las soluciones son:");
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }
    public void calcularDeterminate(){
        double determinate = Math.pow(b, b) - (4 * a * c);
        if (determinate> 0.0){

        }

    }
}
