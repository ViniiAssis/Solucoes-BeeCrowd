import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        double pi = 3.14159;
        double raio = s.nextDouble();
        double area = pi*Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);
        s.close();
    }
}