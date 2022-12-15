package Exercicio4;

import java.util.Scanner;
public class Trapezio{
public static void main(String[] args){
        
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe a base maior:");
        double base_maior = numeros.nextDouble();
        System.out.println("Informe a base menor:");
        double base_menor = numeros.nextDouble();
        System.out.println("Informe a altura");
        double altura = numeros.nextDouble();

        System.out.println("O valor da area:" + ((base_maior + base_menor)*altura)/2);
    }
}

