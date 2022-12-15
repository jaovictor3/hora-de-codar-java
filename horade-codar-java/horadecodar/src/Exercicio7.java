import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        double a = ler.nextDouble();

        System.out.println("Insira o segundo valor:");
        double b = ler.nextDouble();

        System.out.println("Insira o terceiro valor:");
        double c = ler.nextDouble();

        if (a < b && b < c){
            System.out.println("O maior número é " + (b+c));
        } else if (b< a && a < c) {
            System.out.println("O maior  número é  " + (c+a));
        } else if (c<a && a < b) {
            System.out.println("O maior número é " + (a+b));
        }
    }
}