import br.com.alura.contabancaria.ContaBancaria;

public class UsuarioContaBancaria {

   public static void main(String[] args) {

       ContaBancaria conta1 = new ContaBancaria();

       conta1.titular = "Edmilson Soares Gomes";
       conta1.setNumeroConta(1931);
       conta1.setsaldo(1234.12);

       conta1.telaLogin();

    }
}
