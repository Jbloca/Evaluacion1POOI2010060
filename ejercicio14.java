import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el día de la semana (1=lunes, 2=martes, ..., 5=viernes): ");
        int diaSemana = scanner.nextInt();

        System.out.print("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.print("Ingresa los minutos (0-59): ");
        int minutos = scanner.nextInt();

        int minutosHastaFinDeSemana = 0;
        if (diaSemana < 5) {
            minutosHastaFinDeSemana = ((4 - diaSemana) * 24 * 60) + ((15 - hora) * 60 + (0 - minutos));
        } else if (diaSemana == 5) { // Si es viernes
            if (hora < 15) {
                minutosHastaFinDeSemana = ((15 - hora) * 60) + (0 - minutos);
            }
        }
        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");

        scanner.close();
    }
}
