package org.example;

import java.util.Scanner;


public class Main {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true){
            System.out.println("Bienvenido a la Calculadora");
            System.out.println("Ingrese la opcion que desee: ");
            System.out.println("1, Perimetro y area de un circulo ");
            System.out.println("2, Area y volumen de una esfera");
            System.out.println("3, Perimetro, area y volumen de un cuadrado/cubo");
            System.out.println("4, Area y volumen de un cono");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Calculadora.CirculoCalculadora();
                    break;
                case 2:
                    Calculadora.EsferaCalculadora();
                    break;
                case 3:



















                    Calculadora.CuadradoCalculadora();
                    break;
                case 4:
                    Calculadora.ConoCalculadora();
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");

            }


        }

    }
}


