import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();

        double MEDIA = ((A*3.5)+(B*7.5))/11;

        System.out.printf("MEDIA = %.5f%n", MEDIA);
        s.close();
    }
}
