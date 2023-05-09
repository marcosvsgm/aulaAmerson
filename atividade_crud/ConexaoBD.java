package atividade_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public static void main(String[] args) {
        Connection conexao = null;
        
        try {
            // Carrega o driver JDBC correspondente ao MySQL
            Class.forName("com.mysql.jdbc.Driver");
            
            // Estabelece a conexão com o banco de dados MySQL
            conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/crud", "usuario", "senha");
            
            // Interage com o banco de dados
            
            // ...
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão com o banco de dados");
            e.printStackTrace();
        } finally {
            // Fecha a conexão com o banco de dados
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão com o banco de dados");
                e.printStackTrace();
            }
        }
    }
}
