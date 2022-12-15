import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char outro = 'n';

        while (outro == 'n') {

            System.out.println("Insira o nome do aluno");
            String nome = ler.nextLine();

            System.out.println("Insira a primeira nota");
            double n1 = ler.nextDouble();

            System.out.println("Insira a segunda nota");
            double n2 = ler.nextDouble();

            System.out.println("Insira a terceira nota");
            double n3 = ler.nextDouble();

            System.out.println("Insira a quarta nota");
            double n4 = ler.nextDouble();


            double media = ((n1 + n2 + n3 + n4) / 4);

            if (media >= 6.0) {
                System.out.println("O aluno " + nome + " passou :)");
            } else {
                System.out.println("O aluno " + nome + " reprovou :(");
            }
        }
    }
}