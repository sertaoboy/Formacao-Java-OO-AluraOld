package bytebankComposto.bytebankEncapsulado;
//"A CLASSE CONTA E A UNICA QUE DEVE SER RESPONSAVEL PELOS ATRIBUTOS DA CLASSE CONTA, E MAIS NINGUEM!" Paulo Silveira.
public class Conta {
    private double saldo;  
    private int agencia;                            
    private int numero;
    private Cliente titular;
    

    public Conta(int agencia, int numero){ 
        if(agencia <= 0 || numero <= 0) {
            System.out.println("Agencia e Numero nao se pode ter valor 0 ou negativo");
        }else{
            this.agencia=agencia;
            this.numero=numero;
        }
    }//Esse construtor implica na razao da existencia do metodos setAgencia() e setNumero()?? DEPENDE DA ESPECIFICACAO; bom para reflexao; "Atributo imutavel caso sim, pois depois que ele foi criado, nunca mais sera alterado.", Paulo Silveira
    
    //por que um construtor NAO e um METODO? reparar que: nao existe retorno (void,int,etc). So se exceuta com a palavra chave `new`
    //sem o construtror(), o proprio Java define os atributos da classe Conta com valor default: null, 0, false,etc
    //PODE ter mais de um construtor, com diferentes argumentos, implementacoes...
    public Conta(){

    }//neste por exemplo, simula o construtor padrao do Java(como se nem houvessemos escrito);
    //motivo desse ultimo: somente para demonstrar que se pode ter mais de um construtor, com diferentes "identidades" e para as outras classes de teste compilarem, pois nao haviamos utilizado um construtror com parametros


    
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
        if(numero <= 0) {
            System.out.println("Numero da conta 0 ou negativo nao e permitido.");
            return;
        }else{
            this.numero=numero; //o atributo DESSE (this) objeto e o novo numero(int numero)
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
}
