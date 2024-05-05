package HerancaEtc.bytebankHerdado;

public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente(); // Funcionario g1 = new Geren... --> Variavel mais "generica", so tipo Funcionario mas se referindo ao Objeto Gerente; "referencia generia do tipo Funcionario se referenciando ao objeto Gerente"
        //PQ PELO AMOR DE DEUS VC FAZ ISSO????
        //g1.autentica(2222); ----> NAO COMPILA
        //O compilador analisa o TIPO da REFERENCIA, ou seja, REFERENCIA DO TIPO Funcionario
        g1.setNome("Marcos");
        String nome = g1.getNome();
        System.out.println(nome);

        Funcionario f1 = new Funcionario();
        f1.setSalario(2000);
        
        Gerente g2 = new Gerente();
        g2.setSalario(5000.0);
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g2);
        System.out.println(controle.getSomaBonificacao());

        




        controle.registra(f1);
        System.out.println(controle.getSomaBonificacao());



        EditorVideo e1 = new EditorVideo();
        e1.setSalario(2500.0);
        controle.registra(e1);



        Funcionario d1 = new Designer();
        d1.setSalario(1420.5);
        controle.registra(d1);
    }
}
