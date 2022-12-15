package Exercicio4;

import java.util.Scanner;

public class Retangulo{
    public static void main(String[] args){
        System.out.println("Informe a base:");
Scanner ler_base = new Scanner(System.in);
int base = ler_base.nextInt();

System.out.println("Informe a altura:");
Scanner ler_altura = new Scanner(System.in);
int altura = ler_altura.nextInt();
System.out.println("O resultado de base multiplicado por altura é: " + base*altura);
    }
}

