import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa la hora (0-23hrs): ");
        int horas = scanner.nextInt();
        System.out.print("Ingresa los minutos (0-59m): ");
        int minutos = scanner.nextInt();

        int segundosHastaMedianoche = (23 - horas) * 3600 + (59 - minutos) * 60;

        System.out.println("Faltan " + segundosHastaMedianoche + " segundos para llegar a la medianoche.");

        scanner.close();
    }
}
