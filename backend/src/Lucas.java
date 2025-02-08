import java.util.Scanner;

public class Lucas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá mundo Java!");

        System.out.println("Insira o peso do paciente: ");
        double pesoPaciente = sc.nextDouble();

        System.out.println("Insira a altura do paciente: ");
        double alturaPaciente = sc.nextDouble();

        double imcPaciente = pesoPaciente / (alturaPaciente * 2);

        System.out.println("O IMC do paciente é de: " + imcPaciente);

        
        sc.close();
    }
}
