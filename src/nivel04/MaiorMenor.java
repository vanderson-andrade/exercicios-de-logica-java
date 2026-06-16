package nivel04;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite os numeros separandos por espaços: ");
        String coletaNumeros = in.nextLine();
        String[] separaNumeros = coletaNumeros.split(" ");

        int[] numerosTratados = new int[separaNumeros.length];
        for (int i = 0; i < separaNumeros.length; i++) {
            numerosTratados[i] = Integer.parseInt(separaNumeros[i]);
        }

        int menor = numerosTratados[0];
        int maior = numerosTratados[0];

        for (int i = 1; i < numerosTratados.length; i++) {
            if (menor > numerosTratados[i]) {
                menor = numerosTratados[i];
            }
            if (maior < numerosTratados[i]) {
                maior = numerosTratados[i];
            }
        }
        System.out.println("Menor valor digitado: " + menor);
        System.out.println("Maior valor digitado: " + maior);
    }

}
