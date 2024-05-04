package HerancaEtc.bytebankHerdado;

public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente(); // Funcionario g1 = new Geren... --> Variavel mais "generica", so tipo Funcionario mas se referindo ao Objeto Gerente; "referencia generia do tipo Funcionario se referenciando ao objeto Gerente"
        g1.setNome("Marcos");
        String nome = g1.getNome();
        System.out.println(nome);
    }
}
