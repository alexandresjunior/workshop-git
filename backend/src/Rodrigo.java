import java.util.Scanner;

public class Rodrigo {

    public static void main(String[] args) throws Exception {
        System.out.println("Olá Mundo!");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu peso:");
        double peso = entrada.nextDouble();

        System.out.println("Qual é sua altura: ");
        double altura = entrada.nextDouble();

         // Calcular o IMC
         double imc = peso / (altura * altura);

         // Exibir o IMC calculado
         System.out.printf("Seu IMC é: %.2f\n", imc);
 
         // Exibir a classificação do IMC
         if (imc < 18.5) {
             System.out.println("Classificação: Abaixo do peso.");
         } else if (imc >= 18.5 && imc <= 24.9) {
             System.out.println("Classificação: Peso normal.");
         } else if (imc >= 25 && imc <= 29.9) {
             System.out.println("Classificação: Sobrepeso.");
         } else if (imc >= 30 && imc <= 34.9) {
             System.out.println("Classificação: Obesidade grau 1.");
         } else if (imc >= 35 && imc <= 39.9) {
             System.out.println("Classificação: Obesidade grau 2.");
         } else {
             System.out.println("Classificação: Obesidade grau 3 (mórbida).");
         }
 
         // Fechar o scanner
         entrada.close();

    }
}