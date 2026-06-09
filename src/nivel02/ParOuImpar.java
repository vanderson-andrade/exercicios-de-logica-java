package nivel02;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para saber se é par ou impar: ");
        int numero = in.nextInt();

        String resultado = ((numero % 2) == 0)?"O número é par":"O número é impar";

        System.out.println(resultado);
        in.close();
    }
}
