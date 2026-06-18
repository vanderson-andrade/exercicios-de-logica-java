package nivel04;

import java.util.Scanner;

public class MediaDaTurma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] notasNomes = new String[5][5];
        double soma;
        double[] media = new double[5];
        double mediaTurma;

        notasNomes[0][0] = "Vanderson";
        for (int i = 1; i < notasNomes.length; i++) {
            System.out.println(i + "º nota do : " + notasNomes[0][0]);
            notasNomes[0][i] = in.nextLine();
        }
        soma =  (Double.parseDouble(notasNomes[0][1]) + Double.parseDouble(notasNomes[0][2]) + Double.parseDouble(notasNomes[0][3]) + Double.parseDouble(notasNomes[0][4]))/4;
        media[0] = soma;

        notasNomes[1][0] = "Ravy";
        for (int i = 1; i < notasNomes.length; i++) {
            System.out.println(i + "º nota do : " + notasNomes[1][0]);
            notasNomes[1][i] = in.nextLine();
        }
        soma =  (Double.parseDouble(notasNomes[1][1]) + Double.parseDouble(notasNomes[1][2]) + Double.parseDouble(notasNomes[1][3]) + Double.parseDouble(notasNomes[1][4]))/4;
        media[1] = soma;

        notasNomes[2][0] = "Hektor";
        for (int i = 1; i < notasNomes.length; i++) {
            System.out.println(i + "º nota do : " + notasNomes[2][0]);
            notasNomes[2][i] = in.nextLine();
        }
        soma =  (Double.parseDouble(notasNomes[2][1]) + Double.parseDouble(notasNomes[2][2]) + Double.parseDouble(notasNomes[2][3]) + Double.parseDouble(notasNomes[2][4]))/4;
        media[2] = soma;

        notasNomes[3][0] = "Lorena";
        for (int i = 1; i < notasNomes.length; i++) {
            System.out.println(i + "º nota do : " + notasNomes[3][0]);
            notasNomes[3][i] = in.nextLine();
        }
        soma =  (Double.parseDouble(notasNomes[3][1]) + Double.parseDouble(notasNomes[3][2]) + Double.parseDouble(notasNomes[3][3]) + Double.parseDouble(notasNomes[3][4]))/4;
        media[3] = soma;

        notasNomes[4][0] = "Ismaeli";
        for (int i = 1; i < notasNomes.length; i++) {
            System.out.println(i + "º nota do : " + notasNomes[4][0]);
            notasNomes[4][i] = in.nextLine();
        }
        soma =  (Double.parseDouble(notasNomes[4][1]) + Double.parseDouble(notasNomes[4][2]) + Double.parseDouble(notasNomes[4][3]) + Double.parseDouble(notasNomes[4][4]))/4;
        media[4] = soma;

        mediaTurma = (media[0] +  media[1] + media[2] + media[3]  + media[4])/ media.length;
        System.out.println("Media da turma: " + mediaTurma);
    }
}
