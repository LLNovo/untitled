import br.com.alura.Produto.Produto;

public class DescontoMercado {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Sabão");
        produto.setPreco(100.50);

        produto.aplicarDesconto(50);
        produto.mostrarValorFinal();



    }
}
