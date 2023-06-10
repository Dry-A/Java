package jdbc.lojavirtual;

import java.sql.*;

public class TestaListagem {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory criaConexao = new ConnectionFactory();
        Connection con = criaConexao.recuperarConexao();

        PreparedStatement stm = con.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        stm.execute();

        ResultSet resultado = stm.getResultSet();

        while (resultado.next()) {

            Integer id = resultado.getInt("ID");
            String nome = resultado.getString("NOME");
            String descricao = resultado.getString("DESCRICAO");

            System.out.println(id);
            System.out.println(nome);
            System.out.println(descricao);

        }

        System.out.println("Fechando minha conexão");

        con.close();

    }

}
