package atividade_crud;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    // Construtor
    public Cliente(int id, String nome, String cpf, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    // Métodos de manipulação da lista de clientes
    private static List<Cliente> clientes = new ArrayList<>();

    public static void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public static void listar() {
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getId() + " - " + cliente.getNome() + " - " + cliente.getCpf() + " - " + cliente.getEmail() + " - " + cliente.getTelefone());
        }
    }

    public static void editar(int id, String nome, String cpf, String email, String telefone) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setEmail(email);
                cliente.setTelefone(telefone);
                break;
            }
        }
    }

    public static void excluir(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente);
                break;
            }
        }
    }

    // Teste
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "João", "123.456.789-00", "joao@example.com", "(11) 1111-1111");
        Cliente cliente2 = new Cliente(2, "Maria", "987.654.321-00", "maria@example.com", "(11) 2222-2222");

        adicionar(cliente1);
        adicionar(cliente2);

        listar();

        editar(1, "João da Silva", "123.456.789-01", "joaodasilva@example.com", "(11) 1111-2222");

        listar();

        excluir(2);

        listar();
    }
}
