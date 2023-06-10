package jdbc.lojavirtual;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory criaConexao = new ConnectionFactory();
        Connection con = criaConexao.recuperarConexao();

        System.out.println("Fechando minha conexão");

        con.close();


    }
}
