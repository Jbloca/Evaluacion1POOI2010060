import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero (positivo o negativo, hasta 5 dígitos): ");
        int numero = scanner.nextInt();

        int numeroAbsoluto = Math.abs(numero);

        int contadorDigitos = 0;
        while (numeroAbsoluto > 0) {
            numeroAbsoluto /= 10;
            contadorDigitos++;
        }

        System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");

        scanner.close();
    }
}
