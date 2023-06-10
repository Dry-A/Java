package jdbc.lojavirtual;

import java.sql.*;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory criaConexao = new ConnectionFactory();
        Connection con = criaConexao.recuperarConexao();

        Statement stm = con.createStatement();
        stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

        ResultSet resultado = stm.getResultSet();

        while (resultado.next()) {

            Integer id = resultado.getInt("ID");
            System.out.println(id);
            String nome = resultado.getString("NOME");
            System.out.println(nome);
            String descricao = resultado.getString("DESCRICAO");
            System.out.println(descricao);

        }

        System.out.println("Fechando minha conexão");

        con.close();

    }

}
