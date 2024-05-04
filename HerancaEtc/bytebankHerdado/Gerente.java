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
}