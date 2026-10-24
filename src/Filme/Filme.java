package Filme;

public class Filme {

        String nome;
        int anoDeLancamento;
        int somaAvaliacao;
        int totalDeAvaliacao;
        int duracaoEmSegundos;
        double avaliacao;


        void exibirFichaTecnica() {

            System.out.println(nome);
            System.out.println("Ano de Lançamento:" + anoDeLancamento);
            System.out.println("Duração em Segundos: " + duracaoEmSegundos);
        }

        void avalia (double nota){

            somaAvaliacao += nota;
            totalDeAvaliacao++;


        }

        double pegaMedia(){
            return somaAvaliacao / totalDeAvaliacao;


        }

        }

