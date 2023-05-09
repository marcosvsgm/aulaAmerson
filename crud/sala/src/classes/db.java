package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    public static void main(String[] args) {
        Connection conexao = null;

        try {
            // 1. Registrar o driver JDBC
            Class.forName("com.mysql.jdbc.Driver");

            // 2. Abrir a conexão
            String url = "jdbc:mysql://localhost:3306/crud";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão estabelecida com sucesso!");

            // 3. Utilizar a conexão...

        } catch (SQLException e) {
            System.out.println("Erro ao tentar se conectar ao banco de dados: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        } finally {
            // 4. Fechar a conexão
            if (conexao != null) {
                try {
                    conexao.close();
                    System.out.println("Conexão fechada com sucesso!");
                } catch (SQLException e) {
                    System.out.println("Erro ao tentar fechar a conexão: " + e.getMessage());
                }
            }
        }
    }
}

