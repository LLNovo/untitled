package Musica;

public class DadosMusica {
    static void main(String[] args) {

        Musica musica = new Musica();

        musica.titulo = "Bad Brains";
        musica.artista = "Bad Brains";
        musica.anoDeLancamento = 1982;

        musica.exibirFichaTecnica();

        musica.avalia(4);
        musica.avalia(5);
        musica.avalia(4);

        System.out.println("Soma das notas: " + musica.somaDasNotas);
        System.out.println("Quantidade de avaliações: " +musica.quantidadeDeAvaliacoes);
        System.out.println("Média das avaliações: " + musica.pegaMedia());

    }
}
