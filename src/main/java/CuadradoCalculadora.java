import java.util.Scanner;

public class CuadradoCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado1 del cuadrado: ");
        double lado = scanner.nextDouble();

        double perimetroCuadrado = 4 * lado;
        double areaCuadrado = lado * lado;
        double volumenCubo = lado * lado * lado;

        System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
        System.out.println("El área del cuadrado es: " + areaCuadrado);
        System.out.println("El volumen del cubo es:"+ volumenCubo);


    }
}
