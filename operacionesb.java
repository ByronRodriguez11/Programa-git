import java.util.Scanner;

public class operacionesb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = 0;
        if (numero2 != 0) {
            division = numero1 / numero2;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        if (numero2 != 0) {
            System.out.println("Division:" + division);
        } else {
            System.out.println("No swe puede dividir porque el segundo mumero ");
        }

        scanner.close();
    }
}
