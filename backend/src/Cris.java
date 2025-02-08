import java.util.Scanner;

public class Cris {
    public static void main(String[] args) {
        System.out.println("Olá, mundo");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso: ");

        Double peso = entrada.nextDouble();

        System.out.println("Digite sua altura: ");

        Double altura = entrada.nextDouble();

        Double imc = peso / (altura * altura); 

        System.out.println("Com altura " + altura + " e peso " + peso + ", o IMC fica " + imc);
    }
}
