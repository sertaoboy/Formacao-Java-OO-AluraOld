package Exercicios.exercicio3;

public class Main {
    public static void main(String[] args) {
        Trimestre primeiroTrimestre = new Trimestre();

        Mes janeiro = new Mes();
        janeiro.gasto.valor = 15000;
        janeiro.nome = "Janeiro";

        Mes fevereiro = new Mes();
        fevereiro.gasto.valor=23000;
        fevereiro.nome = "Fevereiro";

        Mes marco = new Mes();
        marco.gasto.valor=17000;
        marco.nome = "Março";




        primeiroTrimestre.primeroMes=janeiro;
        primeiroTrimestre.segundoMes=fevereiro;
        primeiroTrimestre.terceiroMes=marco;
        primeiroTrimestre.gastoDoTrimestre();
        primeiroTrimestre.gastoMedioDoTrimestre();


        
        
        

        
    }
}
