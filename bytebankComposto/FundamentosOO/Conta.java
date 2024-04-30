package bytebankComposto.FundamentosOO;

public class Conta {
    private double saldo;  //quando se tem um atributo modificado, ele nao pode ser lido nem escrito(modificado); ou seja, precisamos de uma maneira(comportamento, metodo, etc) de acessar o atributo
    int agencia;                            
    int numero;
    Cliente titular = new Cliente(); // "toda conta ja abre um cliente(cria,etc)"

 
    public void transfere(Conta destino, double valor) { 
        if(this.saldo >= valor) {
            destino.saldo=destino.saldo+valor;
            this.saldo = this.saldo - valor;
            destino.deposita(valor);
            
        }
    }

    public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo=this.saldo-valor;
            return true;
        }else{
            return false;
        }
    }

    public void deposita(double valor) { 
        this.saldo = this.saldo + valor;
    }

    public double pegaSaldo(){
        return this.saldo;
    }
}
