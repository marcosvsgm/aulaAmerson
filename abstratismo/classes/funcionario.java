package classes;

abstract class funcionario {
    private String nome;
    private String cargo;
    private double salario;
    
    // construtor
    public funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public funcionario(String string, double d) {
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // método para calcular aumento de salário
    public void BomificacaoSalario(double percentual) {
        salario += (salario * (percentual / 100));
    }
    
    // método toString para exibir informações do funcionário
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
    }

    /*public static void main(String[] args) {
        funcionario funcionario = new funcionario("João", 2500.0);
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário do funcionário: " + funcionario.getSalario());
    }*/
}
