package br.com.alura.screenmatch.modelos;

public class Filme {

    public String nome;
    private int anoDeLancamento;
    private  int somaAvaliacao;
    private double totalDeAvaliacao;
    private  int duracaoEmSegundos;
    private double avaliacao;

    public int getSomaAvaliacao(){
        return somaAvaliacao;
    }

    public double getTotalDeAvaliacao(){
        return totalDeAvaliacao;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public void exibirFichaTecnica() {

        System.out.println(nome);
        System.out.println("Ano de Lançamento:" + anoDeLancamento);
        System.out.println("Duração em Segundos: " + duracaoEmSegundos);
    }

    public void avalia (double nota){

        somaAvaliacao += nota;
        totalDeAvaliacao++;


    }

    public double pegaMedia(){
        return somaAvaliacao / totalDeAvaliacao;


    }

}

