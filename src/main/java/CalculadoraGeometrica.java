import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
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
}
