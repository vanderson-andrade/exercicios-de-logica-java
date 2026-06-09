package nivel01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaSimples {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#,##0.##");

        double primeiraNota;
        double segundaNota;
        double terceiraNota;
        double quartaNota;
        double media;

        String resultado;

        System.out.println("Digite a primeira nota: ");
        primeiraNota = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        segundaNota = in.nextDouble();
        System.out.println("Digite a terceira nota: ");
        terceiraNota = in.nextDouble();
        System.out.println("Digite a quarta nota: ");
        quartaNota = in.nextDouble();

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;
        resultado = numberFormat.format(media);

        System.out.println("A média do aluno é: " + resultado);

        in.close();
    }
}
