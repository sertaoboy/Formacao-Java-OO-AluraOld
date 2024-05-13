package HerancaEtc.bytebankHerdado;

public abstract class Funcionario { //introducao a classes abstratas
    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao(){
        System.out.println("Chamando o metodo BONIFICACAO do Funcionario");
        return this.salario * 0.05; 
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
