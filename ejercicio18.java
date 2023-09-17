import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número límite: ");
        int numeroLimite = scanner.nextInt();

        System.out.print("Ingrese un número por el cual no deben ser divisibles: ");
        int numeroDivisor = scanner.nextInt();

        if (numeroDivisor == 0) {
            System.out.println("El divisor no puede ser 0.");
        } else {
            System.out.println("Números enteros positivos menores a " + numeroLimite +
                    " que no son divisibles por " + numeroDivisor + ":");

            for (int i = 1; i < numeroLimite; i++) {
                if (i % numeroDivisor != 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
