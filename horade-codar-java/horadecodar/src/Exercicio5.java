import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        System.out.println("Escreva um valor");
        Scanner numeros = new Scanner(System.in);
        int numero_usuario = numeros.nextInt();

        if (numero_usuario < 0 ){
            System.out.println("Valor negativo");

        } 
        else if (numero_usuario > 0){
            System.out.println("Valor positivo");
        }
        else 
        {
        System.out.println("Valor Neutro");
    }
}
}