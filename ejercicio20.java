import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        long numero = scanner.nextLong();

        long sumaDigitosPares = 0;
        int numDigitosPares = 0;

        if (numero < 0) {
            numero = -numero;
        }

        while (numero > 0) {
            long digito = numero % 10;

            if (digito % 2 == 0) {
                if (numDigitosPares > 0) {
                    System.out.print(", "); 
                }
                System.out.print(digito);
                sumaDigitosPares += digito;
                numDigitosPares++; 
            }

            numero /= 10; 
        }

        if (numDigitosPares > 0) {
            System.out.println("\nSuma de los dígitos pares: " + sumaDigitosPares);
        } else {
            System.out.println("\nNo se encontraron dígitos pares en el número.");
        }

        scanner.close();
    }
}
