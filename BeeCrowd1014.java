import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        double Y = s.nextDouble();

        double resultado = X/Y;

        System.out.printf("%.3f km/l%n", resultado);
   }
}
