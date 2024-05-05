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
        if(agencia <= 0 || numero <= 0) {
            System.out.println("Agencia e Numero nao se pode ter valor 0 ou negativo");
        }else{
            System.out.println("O total de contas instanciadas e: "+Conta.total);
            this.agencia=agencia;
            this.numero=numero;
            System.out.println("Criando uma conta com o numero: "+this.numero+", e agencia: "+this.agencia+".");
        }
    }

    
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
