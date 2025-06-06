package org.exemple.bancoTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        // SQL corrigido para criar a tabela
        String sql = "CREATE TABLE pessoas (" +
                "codigo INT AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL," +
                "idade INT NOT NULL," +
                "email VARCHAR(80) NOT NULL" +
                ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!!");
        conexao.close();
    }
}
