import br.com.alura.Livro.Livro;

public class DescricaoLivro {
    public static void main(String[] args) {

        Livro l1 = new Livro();

        l1.setAutor("Rodrigo Salles");
        l1.setTitulo("Campos Imorais");
        l1.setAnolancamento(2026);

        l1.exibirDetalhe();
    }
}
