package nivel01;

import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        int soma;

        System.out.println("Digite o primeiro número inteiro: ");
        primeiroNumero = in.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        segundoNumero = in.nextInt();

        soma = primeiroNumero + segundoNumero;

        System.out.println("Resultado: " + primeiroNumero + " + " + segundoNumero + " = " + soma);

        in.close();
    }
}
