package exercdiom3;

import java.util.Scanner;

public class operacoes1 {

    public static double soma (double a, double b) {
        double c = a + b;
        return c;
    }

    static double subtracao (double a, double b){
        double c = a - b;
        return c;
    }
    static double multiplicacao (double a, double b){
        double c = a * b;
        return c;
    }
    static double divisao (double a, double b) {
        double c = a / b;
        return c;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        double a, b;

        System.out.println("Calcule 4 operações de dois valores!");
        System.out.println("Digite o valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = teclado.nextDouble();

        System.out.println("A soma de " + a + " e " + b + " é: " + operacoes1.soma(a,b));
        System.out.println("A subtração de " + a + " e " + b + " é: " + operacoes1.subtracao(a,b));
        System.out.println("A multiplicação de " + a + " e " + b + " é: " + operacoes1.multiplicacao(a,b));
        System.out.println("A divisão de " + a + " e " + b + " é: " + operacoes1.divisao(a,b));


    }

}
