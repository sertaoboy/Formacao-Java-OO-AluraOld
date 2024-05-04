package HerancaEtc.bytebankEncapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero()); //1337









        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome()); 

        conta.getTitular().setProfissao("Programador"); 
        Cliente titularDaConta = conta.getTitular(); 
        titularDaConta.setProfissao("Programador");







        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());

        
    }
}
