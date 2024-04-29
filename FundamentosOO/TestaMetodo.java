package FundamentosOO;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.transfere(conta,120);
        System.out.println(conta.saldo);

        conta.saca(20);
        System.out.println(conta.saldo);
    }
}
