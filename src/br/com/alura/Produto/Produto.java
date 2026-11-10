package br.com.alura.Produto;

public class Produto {

    private String nome;
    private double preco;

    public String getnome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getpreco(){
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto (double valor){
        System.out.println("Produto: R$" + getnome());
        System.out.println("Valor original: R$" +getpreco());
        System.out.println("Digite o Valor de desconto: ");
        preco = preco*(valor/100);
    }

    public void mostrarValorFinal(){
        System.out.println("Valor com desconto: R$" + getpreco());

    }

}
