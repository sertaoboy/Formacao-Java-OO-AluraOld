package bytebankEncapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.numero = 1337; -> nao compila, atributos protegidos
        conta.setNumero(1337);
        // System.out.println(conta.numero); --> nao compila, atributos protegidos
        System.out.println(conta.getNumero()); //1337


        Cliente paulo = new Cliente();
        //conta.titular.nome = "paulo"; ---> devemos evitar, mais uma vez: ATRIBUTOS DE CLASSE DEVEM ESTAR PROTEGIDOS; ACESSO SOMENTE ATRAVES DE METODOS
        // paulo.nome = "paulo silveira"; ---> mesmo exemplo acima, porem ja com o setTitular definido para se referenciar a Classe Conta atraves de de metodos
        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome()); // Na referencia `conta`, acesso o atributo titular da classe Conta, que por sua vez acessa o atributo da referencia `paulo` acessando o atributo `nome` da classe Cliente

        conta.getTitular().setProfissao("programador"); // na referencia `conta`, acesso o atributo titular da classe Conta, que por sua vez *setta* o atributo `profissao` da referencia `paulo` para o conteudo "programador"
        //agora em duas linhas:
        Cliente titularDaConta = conta.getTitular(); // variavel temporaria (!=atributo!!!!!!)
        titularDaConta.setProfissao("Programador"); //uma outra forma de *settar* o atributo `profissao` da classe Cliente atraves da variavel temporaria acima







        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
        // retorna o mesmo conteudo; maneiras diferentes de acesso
    }
}
