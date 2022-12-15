package Exercicio4;

import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        System.out.println("Informe o valor da base:");
        int base = numero.nextInt();
        System.out.println("Informe o valor da altura:");
        int altura = numero.nextInt();
        System.out.println("O valor do triangulo:" + ((base*altura)/2));
    }
}