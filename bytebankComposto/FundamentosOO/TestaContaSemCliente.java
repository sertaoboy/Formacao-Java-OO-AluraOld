package bytebankComposto.FundamentosOO;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.saldo);

        contaDaMarcela.titular = new Cliente(); //AQUI: momento onde ja instancio a referencia para o atributo `titular` da contaDaMarcela
        System.out.println(contaDaMarcela.titular); //bytebankComposto.FundamentosOO.Cliente@5305068a
        contaDaMarcela.titular.nome = "Marcela"; //Marcela
        System.out.println(contaDaMarcela.titular.nome); 
       
    }
}
