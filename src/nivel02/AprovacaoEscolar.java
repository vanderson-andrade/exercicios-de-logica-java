package nivel02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AprovacaoEscolar {

    public static void main(String[] args){
        DecimalFormat numeroFormatado = new DecimalFormat("##0.##");

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = in.nextLine();

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double segundaNota = in.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double terceiraNota = in.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double quartaNota = in.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;

        if (media < 7){
            String mensagem = media < 5 ?" está reprovado(a) por média":" está de recuperação";
            System.out.println(nomeAluno + mensagem);
        }else {
            System.out.println(nomeAluno + " está aprovado(a)!");
        }
        System.out.println("Média: " + numeroFormatado.format(media));


        in.close();
    }
}
