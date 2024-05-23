package src.main.java.br.com.comissao.dao;

public abstract class Administrador implements IFuncionario{
    private int id_Funcionario;
    private String nome;
    private double saldoComissao;
    private double salarioFixo;

    public Administrador(double salarioFixo){
        this.salarioFixo = salarioFixo;
    }

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

    public double getSalarioFixo(){
        return this.salarioFixo;
    }
}
