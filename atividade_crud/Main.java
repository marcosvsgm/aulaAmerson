package atividade_crud;

public class Main {
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

