package HerancaEtc.bytebankHerdado;

public class Gerente extends Funcionario { //extends; "O Gerente eh um (extends) Funcionario" Nico, instrutor alemao de java.
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getSenha() {
        return senha;
    }
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }else{
            return false;
        }
    }


    //introducao a reescrita: o metodo getBonificacao() herdado foi reescrito `override`
    public double getBonificacao(){
        //return this.salario; // a essa classe???
        //return super.salario; //introducao a `super`: diferente do `this`, a palavra chave se refere diretamente a classe Mae; `this` se referencia a essa clase, mas o atributo `salario` nao esta presente aqui, apesar de ser heranca da classe Mae

        //return (this.salario * 0.1 )+ super.salario; 
        // exemplo onde o metodo de bonificacao foi alterado na classe Funcionario, (por uma regra de negocio, por exemplo) e "alguem esqueceu" de alterar, corrigir na classe Gerente, deixando o `g1` "bem na vida"

       // return super.getBonificacao()+ super.salario; //corrigindo o problema acima utilizando a palavra chave `super`, indicando que o metodo "quer enxergar algo de sua classe Mae, no caso, o metodo para retornar o valor da bonificacao, que foi remodelado, e somando com o salario "
        //chamando o metodo da classe Funcionario, agora especificando que ao se referir a sua classe mae, qualquer nova mudanca la, altera aqui, bem como outras classes que trabalham dessa maneira

        //!!!!!return this.getBonificacao() + super.salario; --> problema de implementacao, uso do `this` faz com que o metodo fique chamando sempre ele mesmo ("this same") ao ser invocado


        return super.getBonificacao() + super.getSalario(); //CONVENCAO: acessando os atributos atraves de metodos (ENCAPSULAMENTO)
    }
}