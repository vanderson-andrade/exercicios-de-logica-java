package nivel03;

import java.util.Scanner;

public class ValidadorSenha {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String senha = "Qwe102030@";
        String verificaSenha;

        do {
            System.out.print("Digite sua senha: ");
            verificaSenha = in.nextLine();

            if (!senha.equals(verificaSenha)) {
                System.out.println("Senha inválida!");
            }

        } while (!senha.equals(verificaSenha));

        System.out.println("Senha válida!");

        in.close();
    }

}

