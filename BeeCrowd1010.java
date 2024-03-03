import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  s = new Scanner(System.in);

        int CODIGO1 = s.nextInt();
        int NUMERO1 = s.nextInt();
        double VALOR1 = s.nextDouble();

        int CODIGO2 = s.nextInt();
        int NUMERO2 = s.nextInt();
        double VALOR2 = s.nextDouble();

        double TOTAL = (NUMERO1*VALOR1)+(NUMERO2*VALOR2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);
        s.close();
    }
}