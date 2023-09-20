import java.util.Scanner;

public class EsferaCalculadora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        double areasuperficie = 4 * Math.PI * Math.pow(radio, 2.0);
        double volumenesfera = (4 * (Math.PI) * (Math.pow(radio, 3.0))) / 3.0;

        System.out.println("El volumen de la esfera es: " + volumenesfera);
        System.out.println("El area de superficie de una esfera: " + areasuperficie);

    }
}
