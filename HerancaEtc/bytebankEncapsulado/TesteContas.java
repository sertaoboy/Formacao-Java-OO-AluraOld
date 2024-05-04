package HerancaEtc.bytebankEncapsulado;

public class TesteContas {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 23334);

        conta.deposita(200.0);

        System.out.println(conta.getSaldo());

        conta.setAgencia(567);

        System.out.println(conta.getAgencia());

        System.out.println("Total de contas:" + Conta.getTotal());
    }
}
