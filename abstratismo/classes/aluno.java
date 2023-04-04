package classes;

public class aluno extends pessoa {
    private int matricula;

    public aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Matrícula: " + matricula);
    }
}

