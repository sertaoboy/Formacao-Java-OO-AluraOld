package bytebankComposto.FundamentosOO;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "2222222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        
        //associa o cliente paulo a contaDoPaulo
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);

        System.out.println(contaDoPaulo.titular); //bytebankComposto.FundamentosOO.Cliente@5305068a
        System.out.println(paulo); //bytebankComposto.FundamentosOO.Cliente@5305068a
        
       
    }
}
