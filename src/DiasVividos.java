import java.util.Scanner;

public class DiasVividos {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int anosVida;
        int diasVividos;

        System.out.println("Digite sua idade: ");
        anosVida = in.nextInt();

        diasVividos = anosVida * 365;

        System.out.println("Você ja viveu aproximadamente: " + diasVividos + " dias");
        in.close();
    }
}
