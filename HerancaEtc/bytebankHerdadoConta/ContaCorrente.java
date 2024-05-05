package HerancaEtc.bytebankHerdadoConta;

public class ContaCorrente extends Conta { //O construtor nao e herdada!! O contrutor somente se refere a classe a qual esta!!! =====> Implicit super constructor Conta() is undefined for default constructor. Must define an explicit constructorJava(134217868)
    

    public ContaCorrente(int agencia, int numero) { //======> Implicit super constructor Conta() is undefined. Must explicitly invoke another constructorJava(134217871)
        //resoluocao:
        super(agencia,numero); //como a casse Conta nao possui um construtor padrao aqui neste projeto, precisamos informar quais os parametros deste construtor
        //super(); ==> caso tivesse um construtor padrao
    }



    @Override //palavra chave que indica ao compilador que DE FATO voce ira mudar o comportamento de algum metodo herdado, SOBRESCRITA
    public boolean saca(double valor) {
        double valorASacar = valor + 0.25;
        return super.saca(valorASacar);//redefinindo o valor de saque, adicionando 25 centavos a mais; reaproveitando o codigo referente a classe `super`
    }

    
}
