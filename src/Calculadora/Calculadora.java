package Calculadora;

public class Calculadora {

    int numero;

    int calcular (){
        return numero*2;
    }

    void exibeResultado(){

        System.out.println("O número digitdo é: " + numero + ", e o dobro dele é: " + calcular());
    }
}
