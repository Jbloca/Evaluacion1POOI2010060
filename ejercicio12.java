import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        boolean esPar = numero % 2 == 0;
        boolean esDivisiblePor5 = numero % 5 == 0;

        if (esPar && esDivisiblePor5) {
            System.out.println("El número es par y divisible por 5.");
        } else if (esPar) {
            System.out.println("El número es par pero no divisible por 5.");
        } else if (esDivisiblePor5) {
            System.out.println("El número no es par pero es divisible por 5.");
        } else {
            System.out.println("El número no es ni par ni divisible por 5.");
        }

        scanner.close();
    }
}
