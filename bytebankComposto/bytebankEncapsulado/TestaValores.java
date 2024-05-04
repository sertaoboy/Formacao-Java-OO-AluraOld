package bytebankComposto.bytebankEncapsulado;

public class TestaValores {
    public static void main(String[] args) {
        //Conta conta = new Conta();
        
        //abaixo: conta esta inconsistente 
        //conta.setAgencia(-50); //nao permitido
        //conta.setNumero(-330);//nao permitido



        //INTRODUCAO AO  CONSTRUTOR
        Conta conta = new Conta(1337, 24226);//obrigamos que, ao criar uma nova Conta, passe a `agencia` e o `numero`
        System.out.println(conta.getAgencia());// retorna 0; por conta do valor default ao se instanciar um objeto na referencia `conta`
        //impressao que o atributo nasce com um problema; "nasce em um estado inconsistente"

        Conta conta2 = new Conta(1337,16549);

        System.out.println(Conta.getTotal());
        
        

    
    }
}
