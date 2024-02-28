import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double MEDIA = ((a*2)+(b*3)+(c*5))/10;

        System.out.printf("MEDIA = %.1f%n", MEDIA);
        s.close();


    }
}
