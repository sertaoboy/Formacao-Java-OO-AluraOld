package HerancaEtc.bytebankHerdadoConta;

import java.util.zip.CRC32C;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200);

        cc.transfere(cp,10);

        System.out.println(cc.getSaldo()); //dinheiro saindo da ContaCorrente --> 90.0
        System.out.println(cp.getSaldo()); //dinheiro entrando na ContaPoupanca --> 220.0
        //exemplo de polimorfismo, atraves do metodo transfere(Conta c, double valor)


        

        


    }
}
