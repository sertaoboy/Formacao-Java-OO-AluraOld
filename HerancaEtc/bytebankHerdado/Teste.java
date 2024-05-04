package HerancaEtc.bytebankHerdado;

public class Teste {
    public static void main(String[] args) {
        FuncionarioTeste funcionario = new FuncionarioTeste();
        funcionario.setSalario(3000.0);
        System.out.println(funcionario.getBonificacao());
        System.out.println(funcionario.getTipo());;

        FuncionarioTeste f2 = new FuncionarioTeste();
        f2.setTipo(1);
        f2.setSalario(5000);
        System.out.println(f2.getBonificacao());
        System.out.println(f2.getTipo());

        f2.setTipo(2);
        System.out.println(f2.getBonificacao());
    }
}
