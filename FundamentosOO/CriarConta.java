package FundamentosOO;

public class CriarConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo=200;
        System.out.println(conta1.saldo);

        conta1.saldo+=100;
        System.out.println(conta1.saldo);

        Conta conta2 = new Conta();
        conta2.saldo=30;
        System.out.println(conta2.saldo);

        Conta terceiraConta = new Conta();

        conta1.transfere(terceiraConta, 1200);
        System.out.println(terceiraConta.saldo);
        terceiraConta.saca(200);
        System.out.println(terceiraConta.saldo);

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.titular = "Paulo Silveira";
        System.out.println(contaDoPaulo.titular);
    }
}
