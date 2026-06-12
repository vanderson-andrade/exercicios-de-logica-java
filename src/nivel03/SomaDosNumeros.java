package nivel03;

import java.util.Scanner;

public class SomaDosNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Este programa acumula a soma de números digitados até que o 0 seja inserido");
        System.out.println("Digite um número e aperte ENTER (ou 0 para sair): ");

        do {
            numero = in.nextInt();

            soma += numero;

        } while (numero != 0);

        System.out.println("A Soma de todos os números é: " + soma);
        in.close();
    }
}