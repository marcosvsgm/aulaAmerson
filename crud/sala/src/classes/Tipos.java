package classes;

import interfaces.crud;

public class Tipos implements crud{

    
    int id;
    String nome;
    public Tipos(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void atualizar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void deletar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void listar() {
        // TODO Auto-generated method stub
        
    }

}
