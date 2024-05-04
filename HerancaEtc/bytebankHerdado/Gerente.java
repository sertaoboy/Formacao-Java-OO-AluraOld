package HerancaEtc.bytebankHerdado;

public class Gerente extends Funcionario { //extends; "O Gerente eh um (extends) Funcionario" Nico, instrutor alemao de java.
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getSenha() {
        return senha;
    }
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }else{
            return false;
        }
    }


    //introducao a reescrita: o metodo getBonificacao() herdado foi reescrito `override`
    public double getBonificacao(){
        //return this.salario;
        return super.salario; //introducao a `super`: diferente do `this`, a palavra chave se refere diretamente a classe Mae; `this` se referencia a essa clase, mas o atributo `salario` nao esta presente aqui, apesar de ser heranca da classe Mae
    }
}