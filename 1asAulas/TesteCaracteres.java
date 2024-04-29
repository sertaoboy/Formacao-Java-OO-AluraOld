public class TesteCaracteres {
    public static void main (String [] args) {
        char letra = 'a';

        char valor = 65;
        System.out.println(letra);
        System.out.println(valor);


        valor = (char) (valor + 1);
        System.out.println(valor);


        String palavra = "alura melhor lugar para aprender";
        System.out.println(palavra);

        String outraPalavra = "tech";
        System.out.println(palavra + " " + outraPalavra);
    }
}
