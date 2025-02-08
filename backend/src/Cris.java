import java.util.Scanner;

public class Cris {public static void main(String[] args) {
    
Scanner entrada = new Scanner (System.in);

System.out.println("Digite o seu peso:   ");
Double peso = entrada.nextDouble();

System.out.println("Digite sua altura:  ");
Double altura = entrada.nextDouble();

Double imc = peso / (altura * altura);
System.out.println("Com altura " + altura + "e peso" + "  , o IMC fica:  " + imc);

}
}
