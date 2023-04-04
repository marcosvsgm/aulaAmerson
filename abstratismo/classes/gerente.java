package classes;

public class gerente {
    private String nome;
    private double salario;

    public gerente(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        gerente gerente = new gerente("Maria", 5000.0);
        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("Salário do gerente: " + gerente.getSalario());
    }
}
