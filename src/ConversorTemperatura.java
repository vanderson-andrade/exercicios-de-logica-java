import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        double gCelcius;
        double celciusToFahrenheit;

        System.out.println("Digite a temperatura em ºC: ");
        gCelcius = in.nextDouble();

        celciusToFahrenheit = (gCelcius * 1.8) + 32;

        System.out.println("Temperatura convertida: " + celciusToFahrenheit + " ºF");

    }
}
