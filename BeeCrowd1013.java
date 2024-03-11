import java.lang.Math;
import java.util.Scanner;
    public class BeeCrowd1013 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int MaiorAB = (a+b+Math.abs(a-b))/2;
        int MaiorABC = (MaiorAB+c+Math.abs(MaiorAB-c))/2;
        System.out.println(MaiorABC+" eh o maior");

    }

}