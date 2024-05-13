package HerancaEtc.bytebankHerdado;

public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente(); // 
        g1.setNome("Marcos");
        String nome = g1.getNome();
        System.out.println(nome);

        Funcionario f1 = new Funcionario();// isso e estranho, nao deveria funcionar pois Funcionario nao e algo concreto, algo abstrato ou generico. Ninguem diz que e funcionario em uma empresa se lhe perguntam sobre sua profissao por exemplo
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
