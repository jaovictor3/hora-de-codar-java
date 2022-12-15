import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o primeiro valor");
        double a = ler.nextDouble();
        System.out.println("Insira o primeiro valor");
        double b = ler.nextDouble();
        while(b <= 0){
            System.out.println("O valor não pode ser igual ou menor que zero, por favor insira novamente:");
            b = ler.nextDouble();

        }
        System.out.println("A divisão entre os dois valores é " + a/b);
    }
}

