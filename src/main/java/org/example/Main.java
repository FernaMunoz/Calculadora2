package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Bienvenido a la Calculadora");
            System.out.println("1. Operaciones aritméticas");
            System.out.println("2. Ecuación cuadrática");
            System.out.println("3. Figuras geométricas");
            System.out.println("4. Sistema ecuaciones lineales");
            System.out.println("5. Ecuación de la recta");
            System.out.println("0. Salir");
            System.out.println("Ingrese la opcion que desee: ");
            opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }

            switch (opcion) {
                case 1:
                    OperacionesAritmeticas(scanner);
                    break;
                case 2:
                    EcuacionCuadratica(scanner);
                    break;
                case 3:
                    CalculadoraGeometrica(scanner);
                    break;
                case 4:
                    SistemaEcuaciones(scanner);
                    break;
                case 5:
                    EcuacionRecta(scanner);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente");
            }
        }
    }

    public static void OperacionesAritmeticas(Scanner scanner) {

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
                    division(num1, num2);
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
        } while (opcion != 9);

        scanner.close();
    }


    public static void Menu() {
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

    public static double suma(double num1, double num2) {

        System.out.println("la suma es:" + (num1 + num2));
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {

        System.out.println("la resta es:" + (num1 - num2));
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        System.out.println("la multiplicacion es:" + (num1 * num2));
        return num1 * num2;

    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
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

    public static double potencia(double base, double exponente) {
        double potencia = Math.pow(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es: " + potencia);
        return potencia;
    }

    public static double porcentaje(double numPor, double total) {
        if (total == 0) {
            throw new ArithmeticException("el numero total no puede ser cero");
        } else if (total < 0) {
            throw new ArithmeticException("el total no puede ser negativo");
        } else if (numPor < 0) {
            throw new ArithmeticException("la cantidad no puede ser negativo");
        }

        double porcentaje = (numPor / total) * 100;
        System.out.println("El " + numPor + " es el " + porcentaje + "% de " + total);
        return porcentaje;
    }
    private static double[] coeficientes;
    public static void EcuacionCuadratica(Scanner scanner) {
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



    public static void CalculadoraGeometrica(Scanner scanner){
        int opcion;

        while (true){
            System.out.println("Bienvenido a la Calculadora");
            System.out.println("Ingrese la opcion que desee: ");
            System.out.println("Cuadrado, ingrese 1");
            System.out.println("Rectangulo, ingrese 2");
            System.out.println("Circulo, ingrese 3");
            System.out.println("Esfera, ingrese 4");
            System.out.println("Cubo, ingrese 5");
            System.out.println("Cono, ingrese 6");
            System.out.println("Salir, ingrese 0");
            opcion = scanner.nextInt();

            if (opcion == 0){
                break;
            }

            switch (opcion){
                case 1:
                    CalculadoraCuadrado(scanner);
                    break;
                case 2:
                    CalculadoraRectangulo(scanner);
                    break;
                case 3:
                    CirculoCalculadora(scanner);
                    break;
                case 4:
                    EsferaCalculadora(scanner);
                    break;
                case 5:
                    CuboCalculadora(scanner);
                    break;
                case 6:
                    ConoCalculadora(scanner);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente");
            }
        }
    }
    public static void CalculadoraCuadrado(Scanner scanner){

        System.out.print("Ingrese la longitud del lado1 del cuadrado: ");
        double lado = scanner.nextDouble();
        if (lado < 0) {
            throw new IllegalArgumentException("El lado no puede ser negativo");
        }

        double perimetroCuadrado = 4 * lado;
        double areaCuadrado = lado * lado;

        System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
        System.out.println("El área del cuadrado es: " + areaCuadrado);
    }
    public static void CalculadoraRectangulo(Scanner scanner){
        System.out.print("Ingrese el ancho del rectangulo");
        double ancho = scanner.nextDouble();
        if (ancho < 0) {
            throw new IllegalArgumentException("El ancho no puede ser negativo");
        }
        System.out.print("Ingrese el largo del rectangulo");
        double largo = scanner.nextDouble();
        if (largo < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        double perimetroRec = 2 * (largo + ancho);
        double areaRec = largo * ancho;

        System.out.println("Perímetro del rectángulo: " + perimetroRec);
        System.out.println("Área del rectángulo: " + areaRec);

    }
    public static void CirculoCalculadora(Scanner scanner){
        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }

        double perimetrocirculo = 2 * Math.PI * radio;
        double areacirculo = Math.pow(radio, 2.0) * Math.PI;

        System.out.println("El perimetro del circulo es: " + perimetrocirculo);
        System.out.println("El area del circulo es: " + areacirculo);
    }
    public static void EsferaCalculadora(Scanner scanner){
        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }

        double areasuperficie = 4 * Math.PI * Math.pow(radio, 2.0);
        double volumenesfera = (4 * (Math.PI) * (Math.pow(radio, 3.0))) / 3.0;

        System.out.println("El volumen de la esfera es: " + volumenesfera);
        System.out.println("El area de superficie de una esfera: " + areasuperficie);
    }
    public static void CuboCalculadora(Scanner scanner){
        System.out.print("Ingrese la longitud de un lado del cubo: ");
        double lado = scanner.nextDouble();
        if (lado < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        double perimetroCubo = 12 * lado;
        double areaCubo = 6 * Math.pow(lado, 2.0);
        double volumenCubo = Math.pow(lado, 3.0);

        System.out.println("Perímetro del cubo: " + perimetroCubo);
        System.out.println("Área del cubo: " + areaCubo);
        System.out.println("Volumen del cubo: " + volumenCubo);
    }
    public static void ConoCalculadora(Scanner scanner){
        System.out.println("Ingrese el radio: ");
        double radio = scanner.nextDouble();
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        System.out.println("Ingrese la altura: ");
        double altura = scanner.nextDouble();
        if (altura < 0) {
            throw new IllegalArgumentException("La altura no puede ser negativa");
        }
        System.out.println("Ingrese la altura inclinada/hipotenusa");
        double althipotenusa = scanner.nextDouble();
        if (althipotenusa < 0) {
            throw new IllegalArgumentException("La altura inclinada no puede ser negativa");
        }

        double areaCono = Math.PI * radio * (radio + althipotenusa);
        double volumenCono = (altura * (Math.PI) * (Math.pow(radio, 2.0))) / 3.0;

        System.out.println("El area del cono es: " + areaCono);
        System.out.println("El volumen del cono: " + volumenCono);
    }

    public static void SistemaEcuaciones(Scanner scanner) {

        System.out.println("Resolución de un Sistema de Ecuaciones de 2x2");
        System.out.println("El sistema tiene la forma:");
        System.out.println("Ax + By = C");
        System.out.println("Dx + Ey = F");

        double A = 0, B = 0, C = 0, D = 0, E = 0, F = 0;

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

    public static void EcuacionRecta(Scanner scanner) {
        double x1 = Valor_puntos(scanner, "ingrese el valor de x1:");
        double y1 = Valor_puntos(scanner, "ingrese el valor de y1:");
        double x2 = Valor_puntos(scanner, "ingrese el valor de x2:");
        double y2 = Valor_puntos(scanner, "ingrese el valor de y2:");
        double m = Calcular_pendiente(x1, y1, x2, y2);
        double b = Calcular_b(x1, y1, m);
        ec_de_la_recta(m, b);
    }

    public static double Valor_puntos(Scanner scanner, String mensaje) {
        return scanner.nextDouble();

    }

    public static double Calcular_pendiente(double x1, double y1, double x2, double y2) {
        double pendiente = (y2 - y1) / (x2 - x1);
        return pendiente;
    }

    public static double Calcular_b(double x, double y, double pendiente) {
        double b = y - (pendiente * x);
        return b;
    }

    public static void ec_de_la_recta(double pendiente, double b) {
        System.out.println("la ecuacion de la recta es: y = " + pendiente + "x" + b);
    }
}