import java.util.Scanner;

public class BeeCrowd1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int centavos = (int) (valor * 100);

        int[] notasMoedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

        int[] quantidade = new int[notasMoedas.length];

        for (int i = 0; i < notasMoedas.length; i++) {
            quantidade[i] = centavos / notasMoedas[i];
            centavos %= notasMoedas[i];
        }

        System.out.println("NOTAS:");
        for (int i = 0; i < notasMoedas.length; i++) {
            if (i < 6)
                System.out.printf("%d nota(s) de R$ %.2f%n", quantidade[i], notasMoedas[i] / 100.0);
        }
            System.out.println("MOEDAS:");
            for (int n = 0; n < notasMoedas.length; n++) {
                if (n >= 6)
                System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade[n], notasMoedas[n] / 100.0);
        }

        scanner.close();
    }
}
