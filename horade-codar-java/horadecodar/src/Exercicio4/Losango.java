package Exercicio4;

import java.util.Scanner;
public class Losango{
    public static void main(String[] args ){

        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe a diagonal maior:");
        int diagonal_maior = numeros.nextInt();
        System.out.println("Informe a diagonal menor:");
        int diagonal_menor = numeros.nextInt();
        System.out.println((diagonal_maior*diagonal_menor)/2);
    }
}