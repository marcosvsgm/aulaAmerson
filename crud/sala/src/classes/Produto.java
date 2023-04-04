package classes;

import interfaces.crud;

public class Produto implements crud{
    
    int id;
    int Tipo_id;
    String nome;
    double preco;
    int quantidade;

    public Produto(int id, int tipo_id, String nome, double preco, int quantidade) {
        this.id = id;
        Tipo_id = tipo_id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTipos_id() {
        return Tipo_id;
    }
    public void setTipo_id(int tipo_id) {
        Tipo_id = tipo_id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
