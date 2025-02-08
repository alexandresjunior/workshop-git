import java.util.Scanner;

public class Cris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite peso: ");
        Double peso = sc.nextDouble();
        System.out.println("Digite altura: ");
        Double altura = sc.nextDouble();

        Double imc = (peso)/Math.pow(altura, 2);
        sc.close();
        System.out.println("IMC : "+ String.format("%.2f", imc));
    }
}
