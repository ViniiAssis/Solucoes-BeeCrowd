import java.util.Scanner;

public class BeeCrowd1018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();
        int notas[] = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);
        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = valor / notas[i];
            System.out.println(quantidadeNotas + " nota(s) de R$ " + notas[i] + ",00");
            valor %= notas[i];
        }

        s.close();
    }
}