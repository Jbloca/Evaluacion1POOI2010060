import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String combinacionCorrecta = "1111";

        int intentos = 4;

        while (intentos > 0) {
            System.out.print("Introduce la combinación (4 cifras): ");
            String intento = scanner.next();

            if (intento.equals(combinacionCorrecta)) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos--;

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Se han agotado los intentos. La caja fuerte permanece cerrada.");
                }
            }
        }

        scanner.close();
    }
}
