package org.example;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        int opcion;

        do {
            Menu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese un numero");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese otro numero");
                    num2 = scanner.nextDouble();
                    suma(num1, num2);
                    break;

                case 2:
                    System.out.println("ingrese un numero");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese otro numero");
                    num2 = scanner.nextDouble();
                    resta(num1, num2);
                    break;
                case 3:
                    System.out.println("ingrese un numero");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese otro numero");
                    num2 = scanner.nextDouble();
                    multiplicacion(num1, num2);
                    break;
                case 4:
                    System.out.println("ingrese un numero");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese otro numero");
                    num2 = scanner.nextDouble();
                    division (num1, num2);
                    break;
                case 5:
                    System.out.println("ingrese un numero");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese otro numero");
                    num2 = scanner.nextDouble();
                    numMayor(num1, num2);
                    break;
                case 6:
                    System.out.println("ingrese un numero");
                    num1 = scanner.nextDouble();
                    System.out.println("ingrese otro numero");
                    num2 = scanner.nextDouble();
                    numMenor(num1, num2);
                    break;

                case 7:
                    System.out.println("ingrese la base de la potencia");
                    double base = scanner.nextDouble();
                    System.out.println("ingrese el exponente de la potencia");
                    double exponente = scanner.nextDouble();
                    potencia(base, exponente);
                    break;

                case 8:
                    System.out.println("ingrese la cantidad que desea sacar el porcentaje");
                    double numPor = scanner.nextDouble();
                    System.out.println("ingrese el total de la cantidad");
                    double total = scanner.nextDouble();
                    porcentaje(numPor, total);
                    break;
                case 9:
                    System.out.println("saliendo del menu");

                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion !=9);

        scanner.close();
        }



    public static void Menu(){
        System.out.println("MENU");
        System.out.println("1, Suma");
        System.out.println("2, Resta");
        System.out.println("3, Multiplicacion");
        System.out.println("4, Division");
        System.out.println("5, El numero mayor ");
        System.out.println("6, El numero menor");
        System.out.println("7, Potencia");
        System.out.println("8, Porcentaje");
        System.out.println("9, Salir ");
        System.out.println("Seleccione la opcion que desea realizar");
    }

    public static double suma( double num1, double num2 ){

       System.out.println("la suma es:"+ (num1 + num2));
       return num1+num2;
    }

    public static double resta( double num1, double num2){

        System.out.println("la resta es:" + (num1 - num2));
        return num1-num2;
    }

    public static double multiplicacion(double num1, double num2){
        System.out.println("la multiplicacion es:"+ (num1 * num2));
        return num1*num2;

    }

    public static double division(double num1, double num2){
        if(num2 == 0){
            throw new ArithmeticException("no se puede dividir por 0");
        }
        return num1 / num2;
    }
    public static double numMayor(double num1, double num2) {
        double mayor = Math.max(num1, num2);
        System.out.println("el numero mayor es" + mayor);
        return mayor;
    }
    public static double numMenor(double num1, double num2) {
        double menor = Math.min(num1, num2);
        System.out.println("el numero menor es" + menor);
        return menor;
        }
    public static void potencia(double base, double exponente){
          double potencia = Math.pow(base, exponente);
          System.out.println(base + " elevado a " + exponente + " es: " + potencia);
        }
    public static void porcentaje(double numPor, double total){
            double porcentaje = (numPor/total) * 100;
            System.out.println("El " + numPor + " es el "+ porcentaje + "% de " + total );
    }

}