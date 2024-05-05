package HerancaEtc.bytebankHerdado;

public class Funcionario {
    private String nome;
    private String cpf;
    //protected double salario; //`protected`: modificador de visibilidade que permite o acesso direto ao atributo por suas classes FILHAS
    //CONVENCAO: nao utilizar `protected`, evite-os, se possivel deixe TODOS OS ATRIBUTOS PRIVADOS!
    private double salario;

    public double getBonificacao(){
        System.out.println("Chamando o metodo BONIFICACAO do Funcionario");
        return this.salario * 0.05; //alteracao na regra de negocio onde deveria ser reimplementado o metodo para bonificar os funcionarios
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
