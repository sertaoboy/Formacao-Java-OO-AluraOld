public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        boolean estaAcompanhado = false;

        if(idade < 18) {
            if(idade < 18 && !estaAcompanhado) {
                System.out.println("voce e de menor, nao pode entrar");
            }else{
                System.out.println("Pode entrar, voce esta acompanhado");
            }
        }else{
            System.out.println("Voce e de maior, pode entrar");
        }
    }
}