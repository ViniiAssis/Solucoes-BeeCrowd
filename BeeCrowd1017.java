import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int v = s.nextInt();

        double d = v*h;
        double l = d/12;

        System.out.printf("%.3f%n", l);
        s.close();
    }
}
