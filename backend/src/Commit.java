import java.util.Scanner;

public class Commit {
    public static void main(String[] args) throws Exception {
        Scanner pesos = new Scanner(System.in);
        System.out.println("diga o seu peso:");
        float peso = pesos.nextFloat();
        System.out.println("diga a sua altura:");
        float altura = pesos.nextFloat();

        float imc = peso/(altura*altura);

        System.out.println();
    }
}
