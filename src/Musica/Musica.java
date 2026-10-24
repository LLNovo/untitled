package Musica;

public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    int somaDasNotas;
    int quantidadeDeAvaliacoes;


    void exibirFichaTecnica(){

        System.out.println("Nome do Album: " + titulo);
        System.out.println("Nome do Artista: " + artista);
        System.out.println("Ano de Lancamento: "+ anoDeLancamento);

    }

    void avalia (double nota){

        somaDasNotas += nota;
        quantidadeDeAvaliacoes++;

    }

    double pegaMedia(){
        return somaDasNotas / quantidadeDeAvaliacoes;
    }
}
