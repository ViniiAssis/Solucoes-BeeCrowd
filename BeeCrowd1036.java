import java.util.Scanner;

public class BeeCrowd1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double delta = B * B - 4 * A * C;

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double raizDelta = Math.sqrt(delta);
            double R1 = (-B + raizDelta) / (2 * A);
            double R2 = (-B - raizDelta) / (2 * A);

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

        scanner.close();
    }
}
