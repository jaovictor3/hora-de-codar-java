import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Ola," + nome);
    }
}