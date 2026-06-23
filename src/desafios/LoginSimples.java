
package desafios;

import java.util.Scanner;

public class LoginSimples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] infoUsuario = {"vanderson","Qwe123"};
        int count = 0;

        while (count < 3){

            System.out.println("Digite seu usuário: ");
            String usuarioDigitado;
            usuarioDigitado = in.nextLine().trim();
            System.out.println("Digite sua senha: ");
            String senhaDigitada;
            senhaDigitada = in.nextLine().trim();

            boolean autenticado = usuarioDigitado.equals(infoUsuario[0]) && senhaDigitada.equals(infoUsuario[1]);

            if (autenticado){
                System.out.println("Bem-vindo ao sistema!");
                break;
            } else {
                count++;
                if (count < 3) System.out.println("Usuário ou senha incorretos, tente novamente!");
            }
        }
        if (count == 3){
            System.out.println("Limite máximo de tentativas atingido!");
        }
        in.close();

    }
}