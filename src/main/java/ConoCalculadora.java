import java.util.Scanner;

public class ConoCalculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        double radio = scanner.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese la altura inclinada/hipotenusa");
        double althipotenusa = scanner.nextDouble();

        double areaCono = Math.PI * radio * (radio + althipotenusa);
        double volumenCono = (altura * (Math.PI) * (Math.pow(radio, 2.0))) / 3.0;

        System.out.println("El area del cono es: " + areaCono);
        System.out.println("El volumen del cono: " + volumenCono);
    }

}
