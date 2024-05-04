package HerancaEtc.bytebankHerdado;

public class FuncionarioTeste {
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; // 0 - Funcionario Comum; 1 - Gerente; 2 - Diretor
    private int senha;


    //CLASSE EXEMPLO PARA DEMONSTRAR PROBLEMAS EM DEIXAR UMA CLASSE FAZENDO MUITA COISA; reflete problemas de manuntencao, legibildiade, alta coesao

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }else{
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao(){

        if(this.tipo == 0) {
            return this.salario * 0.1;
        }else if( this.tipo == 1) {
            return this.salario;
        }else{
            return this.salario + 1000;
        }
        
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getTipo() {
        return tipo;
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
