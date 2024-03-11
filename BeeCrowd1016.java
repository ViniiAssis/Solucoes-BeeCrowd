import java.util.Scanner;

public class BeeCrowd1016 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int distancia = s.nextInt();

        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        s.close();
    }
}