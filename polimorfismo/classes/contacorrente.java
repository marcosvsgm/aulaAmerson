package classes;

// Classe ContaCorrente - subclasse
public class contacorrente extends contaBancaria {
    private double limite;

    public contacorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override // Sobrescreve o método sacar da superclasse
    public void sacar(double valor) {
        if (valor > (saldo + limite)) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
        }
    }
}
