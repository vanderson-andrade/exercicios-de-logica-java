package nivel02;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mensagem = "Operador inválido!";


        System.out.println("""
                ***** Calculadora Básica *****
                
                Tipos de operação:
                + Soma
                - Subtração
                / Divisão
                * Multiplicação
                """);

        System.out.println("Escolha a operação: ");
        char operacao = in.next().charAt(0);
        if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {
            System.out.println(mensagem);
            in.close();
        }else {

            System.out.println("Digite o primeiro numero: ");
            double primeiroNumero = in.nextDouble();
            System.out.println("Digite o segundo numero: ");
            double segundoNumero = in.nextDouble();

            double resultado;

            switch (operacao){
                case '+':
                    resultado = primeiroNumero + segundoNumero;
                    mensagem = ("A soma dos números é: " + resultado);
                    break;
                case '-':
                    resultado = primeiroNumero - segundoNumero;
                    mensagem = ("A subtração dos números é: " + resultado);
                    break;
                case '/':
                    if (segundoNumero == 0){
                        mensagem = "ERRO: NÃO É POSSIVEL DIVIDIR POR ZERO!\nTENTAR NOVAMENTE!";
                    }else {
                        resultado = primeiroNumero / segundoNumero;
                        mensagem = ("A divisão dos números é: " + resultado);
                    }
                    break;
                case '*':
                    resultado = primeiroNumero * segundoNumero;
                    mensagem = ("O produto dos números é: " + resultado);
                    break;
            }

            System.out.println(mensagem);

            in.close();
        }

    }
}
