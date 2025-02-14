public class Conta {
    private double saldo = 100.0;

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();
        conta.imprimirSaldo();
        conta.sacar(20.0);
        conta.imprimirSaldo();
        double divida = conta.calcularDividaExponencial();
        System.out.println("Dívida Exponencial: " + divida);
    }

    public void sacar(Double valor) {
        saldo -= valor;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public double calcularDividaExponencial() {
        double valorParcela = 50.0;
        double montante = 20.5;

        for (int x = 1; x <= 5; x++) {
            double valorCalculado = valorParcela * x;
            montante += valorCalculado;
        }
        return montante;
    }
}