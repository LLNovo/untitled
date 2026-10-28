import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
        public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Teste");
        meuFilme.setAnoDeLancamento(2020);
        meuFilme.setDuracaoEmSegundos(240);


        meuFilme.exibirFichaTecnica();

        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.avalia(2);

                System.out.println(meuFilme.getSomaAvaliacao());
                System.out.println(meuFilme.getTotalDeAvaliacao());

                System.out.println(meuFilme.pegaMedia());

        }
    }