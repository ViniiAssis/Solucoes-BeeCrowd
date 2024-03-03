# Solucoes-BeeCrowd

O site aceita apenas que a classe seja Main, ou seja, trocar o nome da classe BeeCrowd(número do exercício) para Main.

Por exemplo:

    No exercício 1002:
        Como está:

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

        
        Como deve ser para que o site aceite o exercício:

                        import java.util.Locale;
                        import java.util.Scanner;

                public class Main {
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