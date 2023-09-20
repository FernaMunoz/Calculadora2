import org.example.Main;

import java.util.Scanner;
public class CirculoCalculadora {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        double perimetrocirculo = 2 * Math.PI * radio;
        double areacirculo = Math.pow(radio, 2.0) * Math.PI;

        System.out.println("El perimetro del circulo es: " + perimetrocirculo);
        System.out.println("El area del circulo es: " + areacirculo);

    }
}

