package nivel02;

import java.time.LocalDate;
import java.util.Scanner;

public class MaiorDeIdade {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();

        System.out.println("Digite o ano em que você nasceu: ");
        int anoNascimento = in.nextInt();
        int idade = anoAtual-anoNascimento;
        if ( idade >= 18){
            System.out.println("De acordo com o ano de nascimento informado você já é maior de idade e este ano completa " + idade + " Anos");
        }else{
            System.out.println("De acordo com o ano de nascimento informado você não é maior de idade e este ano completa " + idade + " Anos");
        }
        in.close();
    }
}
