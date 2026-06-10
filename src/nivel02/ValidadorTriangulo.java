package nivel02;

import java.util.Scanner;

public class ValidadorTriangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mensagem;
        System.out.println("Digite as medidas do triângulo: ");

        System.out.println("Primeira medida");
        double primeiraMedida = in.nextDouble();
        System.out.println("Segunda medida");
        double segundaMedida = in.nextDouble();
        System.out.println("Terceira medida");
        double terceiraMedida = in.nextDouble();


        if (primeiraMedida > 0 && segundaMedida > 0 && terceiraMedida > 0){
            if((primeiraMedida + segundaMedida) <= terceiraMedida || (primeiraMedida + terceiraMedida) <= segundaMedida || (segundaMedida + terceiraMedida) <= primeiraMedida){
                mensagem = "Não é triângulo";
            }else{
                mensagem = "É triangulo";
            }
        }else{
            mensagem = "As medidas não podem ser negativas ou 0!";
        }

        System.out.println(mensagem);
        in.close();
    }
}
