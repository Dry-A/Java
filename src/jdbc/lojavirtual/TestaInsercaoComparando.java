package jdbc.lojavirtual;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComparando {
    public static void main(String[] args) throws SQLException {

        String nome = "Mouse";
        String descricao = "Mouse sem fio";

        ConnectionFactory minhaFabrica = new ConnectionFactory();
        Connection conexao = minhaFabrica.recuperarConexao();

        Statement stm = conexao.createStatement();
        stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('"+ nome +"','"+ descricao+"') "
                , Statement.RETURN_GENERATED_KEYS);

        ResultSet resultado = stm.getGeneratedKeys();
        while (resultado.next()) {

            Integer id = resultado.getInt(1);
            System.out.println("O id criado foi " + id);
        }

    }
}
