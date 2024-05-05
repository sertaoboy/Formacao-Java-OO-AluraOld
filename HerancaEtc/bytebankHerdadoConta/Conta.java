package HerancaEtc.bytebankHerdadoConta;

public class Conta {
    //atributos privados: 
    private double saldo;  
    private int agencia;                            
    private int numero;
    private Cliente titular; 
    private static int total; 

    public Conta(int agencia, int numero){ 
        Conta.total++;
        this.agencia=agencia;
        this.numero=numero;
    }

    
    public boolean transfere(Conta destino, double valor) { //metodo que utiliza o polimorfismo, pois tem como parametro um tipo generico `Conta`
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }else {
            return false;
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

    
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){ 
        if(numero <= 0) {
            System.out.println("Numero da conta 0 ou negativo nao e permitido.");
            return;
        }else{
            this.numero=numero; 
        }
        
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

    
    public static int  getTotal(){ 
        return Conta.total;
    }
}
