package HerancaEtc.bytebankHerdado;

public class ControleBonificacao {
    private double somaBonificacao;

    // public void registra(Gerente g){
    //     double boni = g.getBonificacao();
    //     this.somaBonificacao = somaBonificacao + boni;
    // }

    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.somaBonificacao = somaBonificacao + boni;
        //um bom exemplo de mensagem polimorfica, pois ao ser chamado o metodo, a classe nao sabe qual o metodo especifico para o objeto que o invocou, vai depender da REFERENCIA (pra onde o metodo esta apontando)
    }//RESOLUCAO : Como todos SAO Funcionarios, eu posso usar a referencia mais generia pra esse metodo, evitando repeticao de codigo e mas praticas...

    // public void registra(EditorVideo e){
    //     double boni = e.getBonificacao();
    //     this.somaBonificacao = somaBonificacao + boni;
    // }

    //CODE SMELLS --> reparar que para cada classe mais especifica de Funcionario, ha um metodo registra(). 
    //Como resolver isso??????
    //Ideal e ter somente um meotodo
    //----------RESOLUCAO NO METODO `void registra(Funcionario f)` ACIMA------------


    public double getSomaBonificacao() {
        return somaBonificacao;
    }
}
