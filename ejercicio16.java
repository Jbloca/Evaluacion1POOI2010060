import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        scanner.close();
    }
}
