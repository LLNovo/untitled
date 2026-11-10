package br.com.alura.Aluno;

public class Aluno {

    private String nome;
    private int notas;
    private double somaNota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }



    public void setSomaNota(double somaNota) {
        this.somaNota = somaNota;
    }


    public double getSomaNota() {
        return somaNota;
    }


    public void pegaMedia(double nota){
        somaNota += nota;
        notas++;
    }

    public double calculaMedia(){
        return somaNota/notas;
    }

}
