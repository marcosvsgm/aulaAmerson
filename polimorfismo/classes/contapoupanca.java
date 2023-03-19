package classes;

// Classe ContaPoupanca - subclasse
public class contapoupanca extends contaBancaria {
    private double taxaJuros;

    public contapoupanca(double saldoInicial, double taxaJuros) {
        super(saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void calcularJuros() {
        saldo += saldo * taxaJuros;
    }
}

