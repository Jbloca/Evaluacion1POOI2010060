public class Main{
    public static void main(String[] args) {
        double soles = 1200.0;

        //La tasa de conversión de soles a euros (1 sol = 0.25 euros)
        double tasaDeCambio = 0.25;

        double euros = soles * tasaDeCambio;

        System.out.println(soles + " soles equivalen a " + euros + " euros.");
    }
}
