package classes;

public class secretaria extends funcionario {
    private String setor;
    
    // construtor
    public secretaria(String nome, String cargo, double salario, String setor) {
        super(nome, cargo, salario);
        this.setor = setor;
    }
    
    // getter e setter
    public String getSetor() {
        return setor;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    // método para agendar reunião
    public void agendarReuniao(String data, String hora, String local) {
        System.out.println("Reunião agendada para " + data + " às " + hora + " no " + local);
    }
    
    // método toString para exibir informações da secretária
    @Override
    public String toString() {
        return "Secretaria [nome=" + getNome() + ", cargo=" + getCargo() + ", salario=" + getSalario() +
               ", setor=" + setor + "]";
    }

    
}

