import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de horas que trabajas a la semana: ");
        int horasTrabajadas = scanner.nextInt();

        double tarifaHoraOrdinaria = 12.0;
        double tarifaHoraExtra = 16.0;

        double salarioSemanal;
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * tarifaHoraOrdinaria;
        } else {
            int horasOrdinarias = 40;
            int horasExtras = horasTrabajadas - 40;
            salarioSemanal = (horasOrdinarias * tarifaHoraOrdinaria) + (horasExtras * tarifaHoraExtra);
        }

        System.out.println("El salario semanal del trabajador es: " + salarioSemanal + " soles");

        scanner.close();
    }
}
