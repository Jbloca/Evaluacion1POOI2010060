import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("¿Qué nota quieres sacar de promedio? ");
        double notaDeseada = scanner.nextDouble();


        double notaSegundoExamen = (notaDeseada - (notaPrimerExamen * 0.4)) / 0.6;


        System.out.println("Para tener un " + notaDeseada + " en el promedio, necesitas sacar un " + notaSegundoExamen + " en el segundo examen.");
        
        scanner.close();
    }
}
