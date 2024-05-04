package HerancaEtc.bytebankHerdado;

public class Funcionario {
    private String nome;
    private String cpf;
    protected double salario; //`protected`: modificador de acesso que permite o acesso direto ao atributo por suas classes FILHAS

    public double getBonificacao(){
        return this.salario * 0.1;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
