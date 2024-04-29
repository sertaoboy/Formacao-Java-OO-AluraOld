package bytebankComposto.FundamentosOO;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.saldo);

        System.out.println(contaDaMarcela.titular); // null
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome); // EXCECAO: `NullPointerException`
        // O '0' de quando a "variavel" do tipo REFERENCIA (OBJETO) e chamado null; quer dizer "referencia pra lugar nenhum"
    }
}
