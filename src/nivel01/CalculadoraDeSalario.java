package nivel01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraDeSalario {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("#,###,#00.00");

        double valorHoraTrabalhada;
        double horasTrabalhadas;
        double salario;

        String salarioFinal;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = in.nextDouble();

        System.out.println("Digite o valor de sua hora trabalhada em reais(R$): ");
        valorHoraTrabalhada = in.nextDouble();

        salario = horasTrabalhadas * valorHoraTrabalhada;

        salarioFinal = numberFormat.format(salario);

        System.out.println("Seu salário do mês é: R$" + salarioFinal);

        in.close();
    }
}
