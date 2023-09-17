import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double g = 9.81;

        System.out.print("Ingresa la altura desde la que caerá el objeto: ");
        double altura = scanner.nextDouble();

        double tiempoCaida = Math.sqrt((2 * altura) / g);

        System.out.println("El objeto tardará " + tiempoCaida + " segundos en caer desde una altura de " + altura + " metros.");

        scanner.close();
    }
}
