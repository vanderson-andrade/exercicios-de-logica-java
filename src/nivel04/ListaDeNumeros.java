package nivel04;

import java.util.Scanner;

public class ListaDeNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("***** Números em ordem invertida *****");
        System.out.println("Digite os números separados por espaço: ");
        String numeros = in.nextLine();
        in.close();

        String[] numerosTratados = numeros.split("\\s+");

        for(int i = numerosTratados.length - 1; i >= 0 ; i--) {
            System.out.println(numerosTratados[i]);
        }
    }
}
