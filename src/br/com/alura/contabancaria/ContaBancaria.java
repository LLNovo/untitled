package br.com.alura.contabancaria;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getsaldo(){
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public void telaLogin (){
        System.out.println("Cliente " + titular);
        System.out.println("Número da conta: " +getNumeroConta());
        System.out.println("Saldo disónível: R$" + getsaldo());
    }
}
