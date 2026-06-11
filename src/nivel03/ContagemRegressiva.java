package nivel03;

public class ContagemRegressiva {
    public static void main(String[] args) {
        System.out.println("Contagem Regressiva com while:");

        int count = 10;
        while (count > 0){
            System.out.println(count--);
        }

        System.out.println("Contagem Regressiva com for: ");
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
    }
}
