package classes;

 // Classe ContaBancaria - superclasse
public class contaBancaria {
    protected double saldo;

    public contaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

// Exemplo de uso da herança
    public static void main(String[] args) {
        contacorrente cc = new contacorrente(1000, 500);
        cc.depositar(1000);
        cc.sacar(3000); // saldo insuficiente
        cc.sacar(2500); // saque permitido
        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Limite da conta corrente: " + cc.getLimite());

        contapoupanca cp = new contapoupanca(5000, 0.05);
        cp.depositar(1000);
        cp.calcularJuros();
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());
        System.out.println("Taxa de juros da conta poupança: " + cp.getTaxaJuros());
    }


}
