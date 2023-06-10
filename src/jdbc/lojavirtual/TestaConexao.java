package jdbc.lojavirtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {

        Connection minhaConexao = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC","root","root");

        System.out.println("Fechando minha conexão");

        minhaConexao.close();


    }
}
