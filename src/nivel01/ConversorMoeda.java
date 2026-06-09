package nivel01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMoeda {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#,###,###,##0.00");

        double taxaDeConversao = 5.20;
        double valorEmReais;
        double valorConvertido;

        String valorEmDolar;

        System.out.println("Digite o valor em reais(R$): ");
        valorEmReais = in.nextDouble();

        valorConvertido = valorEmReais / taxaDeConversao;

        valorEmDolar = ("$" + numberFormat.format(valorConvertido));
        System.out.println("Valor em Dólares: " + valorEmDolar);

        in.close();
    }
}
