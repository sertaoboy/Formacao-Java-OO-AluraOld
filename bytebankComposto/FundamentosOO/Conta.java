package bytebankComposto.FundamentosOO;

public class Conta {
    double saldo;
    int agencia;                            
    int numero;
    Cliente titular = new Cliente(); // Uma outra forma de se referenciar de maneira mais "generalizada": Toda Conta possui um titular Cliente; obs: e se fosse o caso de um Cliente ter mais de uma Conta? R-Depedende! Isso so exemplifica o fato de que se pode ja criar essa referencia no atributo titular do tipo Cliente

 
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
}
