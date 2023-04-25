import java.sql.*;

public class Conexao {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydb"; // URL de conexão do JDBC para o banco de dados
        String username = "root"; // Nome de usuário do banco de dados
        String password = "nicholas123@"; // Senha do banco de dados

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar-se ao banco de dados: " + e.getMessage());
        }
    }
}
