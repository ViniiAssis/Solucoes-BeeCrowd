import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int FUNCIONARIO = s.nextInt();
        int HORA = s.nextInt();
        double VALOR = s.nextDouble();
        double SALARIO = HORA*VALOR;


        System.out.println("NUMBER = "+ FUNCIONARIO);
        System.out.printf("SALARY = U$ %.2f%n", SALARIO);

        s.close();

    }
}