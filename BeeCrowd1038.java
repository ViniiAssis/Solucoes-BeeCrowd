import java.util.Scanner;

public class BeeCrowd1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();

        double total = precos[codigo - 1] * quantidade;


        System.out.printf("Total: R$ %.2f%n", total);

        scanner.close();
    }
}
