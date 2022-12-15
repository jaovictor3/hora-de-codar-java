import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[] args){
        int valor1;
        int valor2;
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Insira um valor: ");
            valor1 = sc.nextInt();
            System.out.print("Insira outro valor: ");
            valor2 = sc.nextInt();
        }
        int numero = 0;
        int menor = valor2 - valor1;
        int media = 0;
        while(valor1 <= valor2){
            numero = numero + valor1;
            System.out.println(numero);
            valor1++;
        }
        media = numero/menor;
        System.out.println("A media aritmetica é: " + media);
    }
}
