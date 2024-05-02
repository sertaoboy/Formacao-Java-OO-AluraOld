package bytebankComposto.bytebankEncapsulado;
//"A CLASSE CONTA E A UNICA QUE DEVE SER RESPONSAVEL PELOS ATRIBUTOS DA CLASSE CONTA, E MAIS NINGUEM!" Paulo Silveira.
public class Conta {
    private double saldo;  
    private int agencia;                            
    private int numero;
    private Cliente titular;

    
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

    public double getSaldo(){
        return this.saldo;
    }

    // public void setSaldo(double saldo) {//Um novo valor, como parametro
    //     this.saldo = saldo; //o atributo DESSE (this) objeto e o novo valor (double saldo)
    // }
    //E preciso um metodo setSaldo()?? Baseado na estrutura da classe Conta, nao. Pois ja temos metodos que trabalham com o atributo `saldo`: saca(); deposita()
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){ //Um novo numero, como parametro
        this.numero=numero; //o atributo DESSE (this) objeto e o novo numero(int numero)
    }

    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia<=0) {
            System.out.println("Valores negativos para agencia nao e permitido.");
            return;
        }else {
            this.agencia = agencia;
        }
        
    }
    public Cliente getTitular() {
        return this.titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
