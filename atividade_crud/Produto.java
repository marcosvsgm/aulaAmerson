package atividade_crud;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;

    // Construtor
    public Produto(int id, String nome, double preco, int quantidade, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    // Getters e setters
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Métodos de manipulação da lista de produtos
    private static List<Produto> produtos = new ArrayList<>();

    public static void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public static void listar() {
        System.out.println("Lista de produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " - " + produto.getNome() + " - " + produto.getPreco() + " - " + produto.getQuantidade() + " - " + produto.getCategoria().getNome());
        }
    }

    public static void editar(int id, String nome, double preco, int quantidade, Categoria categoria) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);
                produto.setCategoria(categoria);
                break;
            }
        }
    }

    public static void excluir(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(produto);
                break;
            }
        }
    }

    // Teste
    public static void main(String[] args) {
        Categoria categoria = new Categoria(1, "Eletrônicos", "Categoria de produtos eletrônicos");
        Produto produto1 = new Produto(1, "Smartphone", 2000.0, 10, categoria);
        Produto produto2 = new Produto(2, "Notebook", 5000.0, 5, categoria);

        adicionar(produto1);
        adicionar(produto2);

        listar();

        Categoria novaCategoria = new Categoria(2, "Livros", "Categoria de livros");

        editar(1, "Smartphone Apple", 3000.0, 15, novaCategoria);

        listar();

        excluir(2);

        listar();
    }
}

