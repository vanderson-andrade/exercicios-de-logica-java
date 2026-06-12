package nivel03;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10");
        int primeiroNumero = in.nextInt();
        in.close();

        if(primeiroNumero <= 10 && primeiroNumero > 0){
            int segundoNumero = 1;
            int resultado = 0;
            System.out.println("***** TABUADA DO NÚMERO "+primeiroNumero+" *****");

/**
 *
 * Multiplicação
 * **/
            System.out.println("***** Multiplicação *****");
            for (int i = 1; i <= 10; i++) {
                resultado = primeiroNumero * segundoNumero;
                System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultado);
                segundoNumero++;
            }
/**
 *
 * Divisão
 * **/
            System.out.println("***** Divisão *****");

            segundoNumero = primeiroNumero;
            for (int i = 1; i <= 10; i++) {
                resultado = segundoNumero / primeiroNumero;
                System.out.println(segundoNumero + " / " + primeiroNumero + " = " + resultado);

                segundoNumero = segundoNumero+primeiroNumero;
            }
/**
 *
 * Subtração
 * **/
            System.out.println("***** Subtração *****");

            segundoNumero = primeiroNumero+1;
            for (int i = 1; i <= 10; i++) {
                resultado = segundoNumero - primeiroNumero;
                System.out.println(segundoNumero + " - " + primeiroNumero + " = " + resultado);

                segundoNumero++;
            }
/**
 *
 * Adição
 * **/
            System.out.println("***** Adição *****");

            segundoNumero = 1;
            for (int i = 1; i <= 10; i++) {
                resultado = primeiroNumero + segundoNumero;
                System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultado);

                segundoNumero++;
            }

        }else {
            System.out.println("Valor não aceito pelo sistema!");
        }

    }
}
