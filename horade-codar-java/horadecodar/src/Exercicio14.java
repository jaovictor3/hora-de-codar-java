import java.util.Scanner;

public class Exercicio14 {
    public static void main (String[] args){
        Scanner resultado = new Scanner(System.in);
        double numero1, numero2, media = 0;
        int cont = 0;
        String conf;
        do {
            System.out.println("Informe a primeira nota:");
            numero1 = resultado.nextDouble();
            System.out.println("Informe a segunda nota:");
            numero2 = resultado.nextDouble();
            media = (numero1 + numero2)/2;
            if(media >= 6.5){
                System.out.println("Aluno aprovado, media: " + media);
                cont+=1;
            }
            else{
                System.out.println("Aluno reprovado: " + media);
            }
            System.out.println("Calcular a média de outro aluno Sim ou Nao ?");
            conf = resultado.next();
        }
        while(conf.equals("Sim"));
    }
}
