package src.main.java.br.com.comissao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    Connection conexao;

    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String usuario = "postgres";
    private final String senha = "652314";
    private final String driverBanco = "org.postgresql.Driver";

    public Connection abreConexao() throws SQLException{
        try{
            Class.forName(driverBanco);
            return conexao = DriverManager.getConnection(url, usuario, senha);
        }catch (Exception excecao){
            System.out.println("Concexão não foi aberta!");
        }
        return conexao;
    }

    public void fechaConexao() throws SQLException{
        try{
            conexao.close();
        }catch (Exception excecao){
            System.out.println("Conexao não foi fechada!");
        }
    }
}
