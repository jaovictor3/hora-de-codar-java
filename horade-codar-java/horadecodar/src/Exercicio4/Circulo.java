package Exercicio4;

import java.util.Scanner;

public class Circulo{
     public static void main (String[] args){
        double pi = 3.14;
        Scanner numero = new Scanner(System.in);
        System.out.println("informe o valor do raio");
        double raio = numero.nextDouble();
        System.out.println("O valor da area do circulo:"+ (pi*(raio*raio)));
      
     }
}