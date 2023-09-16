import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en megabytes (MB): ");
        double megabytes = scanner.nextDouble();

        //(1 MB = 1000 KB)
        double kilobytes = megabytes * 1000;

        System.out.println(megabytes + " MB equivalen a " + kilobytes + " KB.");

        scanner.close();
    }
}
