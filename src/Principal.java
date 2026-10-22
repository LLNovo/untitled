    public class Principal {
        public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.nome = "Click";
        meuFilme.anoDeLancamento = 2004;
        meuFilme.duracaoEmSegundos = 140;

        meuFilme.exibirFichaTecnica();

        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(5);

                System.out.println(meuFilme.somaAvaliacao);
                System.out.println(meuFilme.totalDeAvaliacao);

                System.out.println(meuFilme.pegaMedia());

        }
    }