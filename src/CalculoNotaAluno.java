import br.com.alura.Aluno.Aluno;

public class CalculoNotaAluno {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();

        a1.setNome("Juvencio Silva");

        a1.pegaMedia(10);
        a1.pegaMedia(10);
        a1.pegaMedia(5);
        a1.pegaMedia(1);


        a1.calculaMedia();

        System.out.println(a1.getNome());
        System.out.println("Soma das notas: " + a1.getSomaNota());
        System.out.println("Média das notas: " + a1.calculaMedia());
    }
}
