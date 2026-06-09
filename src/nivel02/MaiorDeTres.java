package nivel02;

import java.util.Scanner;

public class MaiorDeTres {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = in.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = in.nextInt();
        System.out.println("Digite o terceiro número: ");
        int terceiroNumero = in.nextInt();

        String mensagem = "";
        if(primeiroNumero == segundoNumero && primeiroNumero== terceiroNumero){
            mensagem = "Os tres números são iguais";
        }else if (primeiroNumero == segundoNumero  && primeiroNumero > terceiroNumero){
            mensagem = "O primeiro e o segundo número são iguais e são os maiores";
        } else if (primeiroNumero == terceiroNumero && primeiroNumero > segundoNumero) {
            mensagem = "O primeiro e o terceiro número são iguais e são os maiores";
        } else if (segundoNumero == terceiroNumero && segundoNumero > primeiroNumero) {
            mensagem = "O segundo e o terceiro número são iguais e são os maiores";
        }else {
            if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
                mensagem = "O primeiro número é maior";
            }else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
                mensagem = "O segundo número é maior";
            }else{
                mensagem = "O terceiro número é maior";
            }
        }

        System.out.println(mensagem);

        in.close();
    }
}
