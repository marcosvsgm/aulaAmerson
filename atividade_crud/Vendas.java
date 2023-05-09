package atividade_crud;

import java.util.ArrayList;
import java.util.List;

public class Vendas {
    private List<String> vendas;

    public Vendas() {
        this.vendas = new ArrayList<>();
    }

    public void adicionar(String venda) {
        this.vendas.add(venda);
    }

    public void listar() {
        for (String venda : this.vendas) {
            System.out.println(venda);
        }
    }

    public void editar(int indice, String venda) {
        this.vendas.set(indice, venda);
    }

    public void excluir(int indice) {
        this.vendas.remove(indice);
    }

    public static void main(String[] args) {
        Vendas vendas = new Vendas();
        
        vendas.adicionar("Venda 1");
        vendas.adicionar("Venda 2");
        vendas.adicionar("Venda 3");
        
        System.out.println("Lista de vendas:");
        vendas.listar();
        
        vendas.editar(1, "Venda 2 - editada");
        
        System.out.println("Lista de vendas após edição:");
        vendas.listar();
        
        vendas.excluir(0);
        
        System.out.println("Lista de vendas após exclusão:");
        vendas.listar();
    }
}
