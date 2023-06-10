package jdbc.lojavirtual;

import java.sql.*;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {

        String nome = "Mouse";
        String descricao = "Mouse sem fio";

        ConnectionFactory minhaFabrica = new ConnectionFactory();
        Connection conexao = minhaFabrica.recuperarConexao();

        PreparedStatement stm = conexao.prepareStatement( "INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)"
                ,Statement.RETURN_GENERATED_KEYS);

        stm.setString(1,nome);
        stm.setString(2, descricao);

        stm.execute( );

        ResultSet resultado = stm.getGeneratedKeys();
        while (resultado.next()) {

            Integer id = resultado.getInt(1);
            System.out.println("O id criado foi " + id);
        }

    }
}
