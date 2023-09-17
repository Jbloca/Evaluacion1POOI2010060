import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorNumeros = 0;
        int sumaImpares = 0;
        int mayorPar = Integer.MIN_VALUE;
        
        while (true) {
            System.out.print("Introduce un número (negativo para terminar): ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                break;
            }
            
            contadorNumeros++;
            
            if (numero % 2 != 0) { 
                sumaImpares += numero;
            } else { 
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            }
        }
        
        if (contadorNumeros == 0) {
            System.out.println("No se ha introducido ningún número.");
        } else {
            double mediaImpares = (double) sumaImpares / contadorNumeros;
            
            System.out.println("Cantidad de números introducidos: " + contadorNumeros);
            System.out.println("Media de los impares: " + mediaImpares);
            
            if (mayorPar != Integer.MIN_VALUE) {
                System.out.println("El mayor número par introducido es: " + mayorPar);
            } else {
                System.out.println("No se introdujeron números pares.");
            }
        }
        
        scanner.close();
    }
}
