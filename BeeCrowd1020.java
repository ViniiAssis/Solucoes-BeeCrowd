import java.util.Scanner;

public class BeeCrowd1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeDias = scanner.nextInt();

        int anos = idadeDias / 365;
        int meses = (idadeDias % 365) / 30;
        int dias = (idadeDias % 365) % 30;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", anos, meses, dias);

        scanner.close();
    }
}
