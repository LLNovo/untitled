import br.com.alura.idadepessoa.IdadePessoa;

public class PessoaIdade {
    public static void main(String[] args) {

        IdadePessoa p1 = new IdadePessoa();

        p1.setnome("Willian");
        p1.setidade(18);

        p1.verificarIdade(20);
    }
}
