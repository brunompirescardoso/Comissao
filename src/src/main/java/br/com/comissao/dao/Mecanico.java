package src.main.java.br.com.comissao.dao;

public abstract class Mecanico implements IFuncionario{
    private int idFuncionario;
    private String nome;
    private double saldoComissao;


    @Override
    public int getidFuncionario() {
        return 0;
    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public double setSaldoComissao() {
        return 0;
    }

    @Override
    public double getSaldoComissao() {
        return 0;
    }
}
