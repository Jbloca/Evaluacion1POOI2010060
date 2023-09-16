public class Main {
    public static void main(String[] args) {
       
        int horasTrabajadas = 40; 

        double tarifaPorHora = 12.0;

        double salarioSemanal = horasTrabajadas * tarifaPorHora;

        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por hora: " + tarifaPorHora + " euros");
        System.out.println("Salario semanal: " + salarioSemanal + " euros");
    }
}
