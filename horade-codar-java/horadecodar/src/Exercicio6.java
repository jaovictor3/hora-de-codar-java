import java.util.Scanner;

public class Exercicio6 {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        double a = ler.nextDouble();
        System.out.println("Insira o segundo valor: ");
        double b = ler.nextDouble();
        System.out.println("Insira o terceiro valor: ");
        double c = ler.nextDouble();
        double resultado = Math.max(a, Math.max(b, c));
        System.out.println("O maior número é " + resultado);

       
    }
}
