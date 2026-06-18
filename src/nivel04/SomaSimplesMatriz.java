package nivel04;

import java.util.Scanner;

public class SomaSimplesMatriz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numeros = new int[3][3];
        int soma = 0;

        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                System.out.print("Digite o número para a posição [" + linha + "][" + coluna + "]: ");
                numeros[linha][coluna] = in.nextInt();
            }
        }

        for(int i = 0; i < numeros.length; i++) {
            for (int coluna = 0; coluna < numeros[i].length; coluna++) {
                soma += numeros[i][coluna]; // Acumula o valor de cada célula
            }
        }

        System.out.println("A soma de todos os elementos é: " + soma);
        in.close();
    }
}
