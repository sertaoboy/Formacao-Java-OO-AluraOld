package FundamentosOO;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("saldo da primeira conta " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        segundaConta.saldo = primeiraConta.saldo +5000;
        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("sao a mesma conta");
            System.out.println(primeiraConta);
            System.out.println(segundaConta);
        }
    }
}
