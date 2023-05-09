package atividade_crud;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int id;
    private String nome;
    private String descricao;

    // Construtor
    public Categoria(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos de manipulação da lista de categorias
    private static List<Categoria> categorias = new ArrayList<>();

    public static void adicionar(Categoria categoria) {
        categorias.add(categoria);
    }

    public static void listar() {
        System.out.println("Lista de categorias:");
        for (Categoria categoria : categorias) {
            System.out.println(categoria.getId() + " - " + categoria.getNome() + " - " + categoria.getDescricao());
        }
    }

    public static void editar(int id, String nome, String descricao) {
        for (Categoria categoria : categorias) {
            if (categoria.getId() == id) {
                categoria.setNome(nome);
                categoria.setDescricao(descricao);
                break;
            }
        }
    }

    public static void excluir(int id) {
        for (Categoria categoria : categorias) {
            if (categoria.getId() == id) {
                categorias.remove(categoria);
                break;
            }
        }
    }

    // Teste
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria(1, "Eletrônicos", "Categoria de produtos eletrônicos");
        Categoria categoria2 = new Categoria(2, "Livros", "Categoria de livros");

        adicionar(categoria1);
        adicionar(categoria2);

        listar();

        editar(1, "Produtos Eletrônicos", "Categoria de produtos eletrônicos atualizada");

        listar();

        excluir(2);

        listar();
    }
}

