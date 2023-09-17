import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la letra L: ");
        int altura = scanner.nextInt();

        if (altura >= 2) {
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= altura / 2 + 1; j++) {
                    if (j == 1 || i == altura) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("La altura debe ser mayor o igual a 2.");
        }

        scanner.close();
    }
}

