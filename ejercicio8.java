import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingresa la hora (formato 0-23hrs: ");
        int hora = scanner.nextInt();

        String saludo;
        if (hora >= 6 && hora < 12) {
            saludo = "Buenos días";
        } else if (hora >= 12 && hora < 21) {
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        System.out.println(saludo);

        scanner.close();
    }
}
