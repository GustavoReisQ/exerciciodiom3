package exercdiom3;

import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double emprestimo, valortotal;
        double juros = 0;
        double parcelas = 0;

        System.out.println("Qual o valor do empréstimo que deseja fazer? (1.000 até 20.000) ");
        emprestimo = teclado.nextDouble();
        System.out.println("Em quantas parcelas deseja fazer o empréstimo? ");
        parcelas = teclado.nextDouble();

        if (emprestimo>=1000 && emprestimo<=5000){
            juros = 1.5 + (parcelas*0.5);
            valortotal = emprestimo + (juros*100);
            System.out.println("O valor total do seu empréstimo é de " + valortotal + " com um acréscimo de "
            + juros + "% de juros.");

        } if (emprestimo>5001 && emprestimo<=10000){
            juros = 2.5 + (parcelas*1.0);
            valortotal = emprestimo + (juros*100);
            System.out.println("O valor total do seu empréstimo é de " + valortotal + " com um acréscimo de "
            + juros + "% de juros.");

        } if (emprestimo>10001 && emprestimo<=15000){
            juros = 3.0 + (parcelas*1.5);
            valortotal = emprestimo + (juros*100);
            System.out.println("O valor total do seu empréstimo é de " + valortotal + " com um acréscimo de "
            + juros + "% de juros.");

        } if (emprestimo>15001 && emprestimo<=20000){
            juros  = 4.5 + (parcelas*2.0);
            valortotal = emprestimo + (juros*100);
            System.out.println("O valor total do seu empréstimo é de " + valortotal + " com um acréscimo de "
            + juros + "% de juros.");

        }


    }
}
