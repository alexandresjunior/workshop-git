import java.util.Scanner;

public class Joao {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //PERGUNTAS(SCANNERS)
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso corporal");
        float peso = sc.nextFloat();
        System.out.println("Qual sua altura: ");
        float altura = sc.nextFloat();
        //PROCESSAMENTO(CALCULO)
        float imc = peso / ( altura * altura );
        System.out.println("Seu imc é: "+ imc);
    }
}
