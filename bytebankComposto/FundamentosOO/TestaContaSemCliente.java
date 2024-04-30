package bytebankComposto.FundamentosOO;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.pegaSaldo()); //corrigindo erro do atributo protegido com o metodo pegaSaldo()

        contaDaMarcela.titular = new Cliente(); //isso e possivel gracas a especificacao da classe Conta, onde possui um atributo `Cliente titular = new Cliente();`
        System.out.println(contaDaMarcela.titular); 
        contaDaMarcela.titular.nome = "Marcela"; 
        System.out.println(contaDaMarcela.titular.nome); 
       
    }
}
