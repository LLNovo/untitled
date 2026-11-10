package br.com.alura.Livro;

public class Livro {
    private String titulo;
    private String autor;
    private int anolancamento;

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor(){
        return autor;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnolancamento(){
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    public void exibirDetalhe(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Lançamento: " + getAnolancamento());

    }
}
