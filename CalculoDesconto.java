package nivel02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        DecimalFormat formatarValor = new DecimalFormat("#,##0.00");
        Scanner in = new Scanner(System.in);

        System.out.println("""
                
                ***** Calculo de desconto *****
                
                * Valor minimo para desconto = R$1000,00
                
                Digite o valor do protudo:
                """);
        double valor = in.nextDouble();
        in.nextLine();
        double valorComDesconto = valor;

        if (valor >= 1000.0){

            System.out.println("Digite o nome do vendedor: ");
            String nomeVendedor = in.nextLine();

            System.out.println("""
                    Escolha uma opção de desconto:
                    1 - 10%
                    2 - 15%
                    3 - 25%
                    """);
            int percentual = in.nextInt();

            switch (percentual){
                case 1:
                    valorComDesconto = valorComDesconto - (valor*0.1);
                    break;
                case 2:
                    valorComDesconto = valorComDesconto - (valor*0.15);
                    break;
                case 3:
                    valorComDesconto = valorComDesconto - (valor*0.25);
                    break;
                default:
                    System.out.println("Percentual não registrado!");
                    break;
            }
            if (percentual == 1 || percentual == 2 || percentual == 3){
                System.out.println("***** Desconto aplicado! *****");
                System.out.println("* Vendedor: " + nomeVendedor);
                System.out.println("* Valor Final: R$" + formatarValor.format(valorComDesconto));
            }
        }else {
            System.out.println("Valor não elegivel para desconto!");
        }

        in.close();
    }
}
