package nivel04;

import java.util.Scanner;

public class BuscaNoVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantitade de nomes que sera digitados: ");
        int quantidade = in.nextInt();
        in.nextLine();
        String[] nomes = new String[quantidade];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um nome e aperte enter: ");
            String recebeNome = in.nextLine();
            nomes[i] = recebeNome.toUpperCase().trim();
        }

        System.out.println("===== Busca de nomes =====");
        System.out.println("Digite o nome para fezer uma busca: ");
        String nomeParaBusca = in.nextLine().toUpperCase();
        boolean resultado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeParaBusca)) {
                System.out.println("Nome encontrado: " + nomes[i] + " e esta no index " + i);
                resultado = true;
                break;
            }
        }
        if (!resultado) {
            System.out.println("Nome não  encontrado: " + nomeParaBusca);
        }

        in.close();
    }
}
