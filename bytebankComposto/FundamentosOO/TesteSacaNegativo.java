package bytebankComposto.FundamentosOO;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);
        System.out.println(conta.saca(200)); //false; 100.0
        System.out.println(conta.pegaSaldo()); //atualizando o erro por saldo estar agora protegido, invocando o metodo pegaSaldo()



        //proibido:
        //conta.saldo = conta.saldo - 101; //Um exemplo de como o atributo saldo pode ser manipulado, de tal forma que, tenha um valor negativo. Mesmo sabendo que possivelmente existe um requisito na qual diga: "O sistema deve proibir que o atributo saldo tenha valores abaixo de 0"
        //System.out.println(conta.saldo); // -1.0
        //Requisito: "Nunca acesse o saldo diretamente, use o `deposita`" ---> atribuicao; acessar o atributo diretamente
        //ACESSO SOMENTE ATRAVES DE *METODOS* E NUNCA DIRETAMENTE ATRAVES DOS ATRIBUTOS;
        //Encapsulamento
        //Devemos tornar o atributo saldo "invisivel", "protegido"





    
    }

}
