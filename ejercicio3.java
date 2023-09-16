public class Main {
    public static void main(String[] args) {
        double euros = 1200;

        //la tasa de conversión de euros a pesetas (1 euro = 166 pesetas)
        double tasaDeCambio = 166;

        double pesetas = euros * tasaDeCambio;

        System.out.println(euros + " euros equivalen a " + pesetas + " pesetas.");
    }
}
