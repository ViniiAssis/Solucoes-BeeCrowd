import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        String NOME = s.nextLine();
        double SALARIO = s.nextDouble();
        double VENDAS = s.nextDouble();

        double VALOR = ((VENDAS*15)/100) + SALARIO;

        System.out.printf("TOTAL = R$ %.2f%n", VALOR);
        s.close();
    }
}