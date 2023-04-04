package classes;

public class professor extends pessoa {
    private String disciplina;

    public professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Disciplina: " + disciplina);
    }
}

