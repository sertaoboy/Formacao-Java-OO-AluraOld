# Reutilizacao com heranca
- No caso do exemplo, Funcionario extende para a classe Gerente, logo se herda os dados/atributos/metodos da classe Funcionario.
- Ao instanciar um gerente, o gerente toma como base em todos os atributos da hierarquia (Funcionario), alem do que ja foi definido na classe Gerente (incluindo os meotodos/atributos especificos para Gerente).
- O mesmo vale para os metodos, o gerente pode acessar os metodos da classe Funcionario, alem de poder acessar os metodos da classe Gerente.


# Polimorfismo
- Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas.
- Levando em conta que e instanciado um objeto gerente (`Gerente gerente = new Gerente();`), neste momento, o objeto NUNCA muda o TIPO, ou seja, ele sempre sera um objeto do tipo Gerente.
- Oque pode mudar, no caso, seria o TIPO da REFERENCIA que aponta para o objeto, ou seja, a referencia pode ser do tipo Funcionario, por exemplo (`Funcionario gerente = new Gerente();`).








## Exemplo
```java
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao() {
        return this.salario * 0.1;
    }
}

public class Gerente extends Funcionario {
    private int senha;

    @Override
    public double getBonificacao(){
        return super.getBonificacao() + (this.salario * 0.5);
    }
}
```


- No exemplo acima, a classe Gerente herda os atributos e metodos da classe Funcionario, e ainda implementa um metodo especifico para Gerente, que sobrescreve o metodo da classe mae.
- Real vantagem do polimorfismo (mensagens polimorficas).

