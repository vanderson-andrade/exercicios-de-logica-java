package nivel03;

import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = in.nextInt();
        in.close();

        switch (numero){
            case 0:
                System.out.println("Zero não é primo pois tem infinitos divirores");
                break;
            case 1: System.out.println("O número 1 so tem apenas um divisor(ele mesmo)");
                break;
            case 2:
                System.out.println("O número 2 é o unico número par que é primo!");
                break;
            default:
                if (numero > 1){
                    if (numero % 2 == 0){
                        System.out.println("O " + numero + " não é primo, pois todos os números pares > 2 são divisiveis por 2");
                    } else {
                        int divisor = 3;
                        boolean isPrimo = true;

                        while (divisor < numero) {
                            if (numero % divisor == 0) {
                                isPrimo = false;
                                break;
                            }
                            divisor += 2;
                        }
                        String mensagem = isPrimo ? "Este numéro é primo e também é um número impar!" : "Este é um número impar, mas não é número não primo!";
                        System.out.println(mensagem);
                    }
                }else{
                    System.out.println("Valor inválido! Números primos são apenas inteiros maiores que 1.");
                }
                break;
        }

    }
}
