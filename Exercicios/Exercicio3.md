# Exercicio 3

> Exercícios 3.3: variáveis e tipos primitivos <br>
> Na empresa em que trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15.000 reais, em fevereiro, 23.000 reais, e, em março, 17.000 reais, faça um programa que calcule e imprima o gasto total no trimestre e a média mensal de gastos. Siga esses passos:> <br>
> Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores; <br> 
> Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro e inicialize-a com 15.000; <br>
> Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com 23.000 e 17.000, respectivamente. Utilize uma linha para cada declaração; <br>
> Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras três variáveis; <br>
> Crie uma variável chamada mediaPorMes e inicialize-a com a divisão de gastosTrimestre por três. <br>
> Imprima a variável gastosTrimestre. <br>


### Resolucao da Alura:
```java
class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gasto do trimestre: R$" + gastosTrimestre);
        int mediaPorMes = gastosTrimestre / 3;
        System.out.println("Média mensal: R$" + mediaPorMes);
    }
}
```
