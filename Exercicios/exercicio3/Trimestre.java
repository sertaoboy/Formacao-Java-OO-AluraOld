package Exercicios.exercicio3;

public class Trimestre {
    public Mes primeroMes;
    public Mes segundoMes;
    public Mes terceiroMes;
    public double gasto;

    public void gastoDoTrimestre() {
        this.gasto = this.primeroMes.gasto.valor + this.segundoMes.gasto.valor + this.terceiroMes.gasto.valor;
        System.out.printf("Gasto total do trimestre: R$%8.2f",this.gasto);
        System.out.println();
    }

    public void gastoMedioDoTrimestre(){
        double gastoMedio = (this.gasto)/3;
        System.out.printf("O gasto medio do trimestre: R$%8.2f",gastoMedio);
        System.out.println();
    }
}
