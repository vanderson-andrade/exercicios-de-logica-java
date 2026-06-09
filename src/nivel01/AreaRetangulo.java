package nivel01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat numberFomat = new DecimalFormat("###.0#");

        double baseRetangulo;
        double alturaRetangulo;
        double calculoArea;

        String areaRetangulo;

        System.out.println("Digite o valor da base do retângulo: ");
        baseRetangulo = in.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        alturaRetangulo = in.nextDouble();

        calculoArea = baseRetangulo * alturaRetangulo;

        areaRetangulo = numberFomat.format(calculoArea);

        System.out.println("A aréa do retangulo é: " + areaRetangulo);

        in.close();
    }
}
