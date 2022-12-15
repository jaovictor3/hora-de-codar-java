import java.util.Scanner;

public class Exercicio9 {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira 10 valores");
        double a = ler.nextDouble();
        double acum = 0;
        System.out.println(a);
        while(acum <= 9){
            acum++;
            a = ler.nextDouble();
            System.out.println(a);

        }
    }
}
