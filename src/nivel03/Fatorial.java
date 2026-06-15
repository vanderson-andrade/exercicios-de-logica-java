package nivel03;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para calcular o seu fatorial n!: ");
        int numero = in.nextInt();
        in.close();
        String mensagem;
        // Regras Especiais
        if (numero >= 0) {
            if(numero == 0 || numero == 1){
                mensagem = (numero == 0)?"Por definição matemática, 0! = 1":"Por definição matemática 1! = 1";
            }else {
                long nFatorial = numero;

                for (int i = 1; i < numero; i++){
                    nFatorial = nFatorial*i;
                }
                mensagem = "O resultado de " + numero + "! é = " + nFatorial;
            }
        }else{
            mensagem = "Valor invalido!";
        }
        System.out.println(mensagem);
    }
}

