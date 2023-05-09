package atividade_crud;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private int id;
    private String nome;
    private String email;
    private String telefone;

    // Construtor
    public Vendedor(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Métodos de manipulação da lista de vendedores
    private static List<Vendedor> vendedores = new ArrayList<>();

    public static void adicionar(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public static void listar() {
        System.out.println("Lista de vendedores:");
        for (Vendedor vendedor : vendedores) {
            System.out.println(vendedor.getId() + " - " + vendedor.getNome() + " - " + vendedor.getEmail() + " - " + vendedor.getTelefone());
        }
    }

    public static void editar(int id, String nome, String email, String telefone) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getId() == id) {
                vendedor.setNome(nome);
                vendedor.setEmail(email);
                vendedor.setTelefone(telefone);
                break;
            }
        }
    }

    public static void excluir(int id) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getId() == id) {
                vendedores.remove(vendedor);
                break;
            }
        }
    }

    // Teste
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(1, "João", "joao@example.com", "(11) 1111-1111");
        Vendedor vendedor2 = new Vendedor(2, "Maria", "maria@example.com", "(11) 2222-2222");

        adicionar(vendedor1);
        adicionar(vendedor2);

        listar();

        editar(1, "João da Silva", "joaodasilva@example.com", "(11) 1111-2222");

        listar();

        excluir(2);

        listar();
    }
}

