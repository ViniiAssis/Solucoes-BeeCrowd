import java.util.Scanner;

public class BeeCrowd1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoSegundos = scanner.nextInt();

        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        scanner.close();
    }
}
