package br.com.alura.idadepessoa;

public class IdadePessoa {

    public String nome;
    private int idade;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public int getidade(){
        return idade;
    }

    public void verificarIdade(int idade){
        if (idade >= this.idade) {
            System.out.println(getnome());
            System.out.println(idade + " anos.");
            System.out.println("Maior de idade");
        }
        else {
            System.out.println(getnome());
            System.out.println(idade + " anos.");
            System.out.println("Menor de Idade");
        }

    }


}
