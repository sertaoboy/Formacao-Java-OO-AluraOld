package FundamentosOO;

public class Conta {
    double saldo;
    int agencia;                            
    int numero;
    String titular;
    String cpf;
    String profissao;

    public void transfere(Conta destino, double valor) { //"Forma Imperativa"; "Maneira de transferir dinheiro para outra Conta, de uma Conta (Tem um sujeito)"
        if(this.saldo >= valor) {
            destino.saldo=destino.saldo+valor;
            this.saldo = this.saldo - valor;
            destino.deposita(valor);
            
        }
    }







    public boolean saca(double valor) { //Forma Orientada a Objetos; O metodo, ja sabe a qual sujeito (objeto) ele pertence; *USO DO THIS*
        if(this.saldo >= valor) {
            this.saldo=this.saldo-valor;
            return true;
        }else{
            return false;
        }
    }

    public void deposita(double valor) { //"Maneira de depoistar valor em uma Conta. Mas cade essa conta? (O THIS)"
        this.saldo = this.saldo + valor;
    }
}
