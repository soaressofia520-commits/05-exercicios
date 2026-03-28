import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declação de variavel
        double valordosalario;
        double valordahoraaula;
        int numerosdehorastrabalhadas;
        double porcentagemdedescontoinss;
        double descontodoinss;
        double salariobruto;
        double salarioliquido;

        //entrada de dados

        System.out.println("Informe o valor da hora aula: ");
        valordahoraaula = sc.nextDouble();

        System.out.println(" Informe o valor de horas trabalhadas: ");
        numerosdehorastrabalhadas = sc.nextInt();

        System.out.println("Informe a % de desconto de INSS: ");
        porcentagemdedescontoinss = sc.nextDouble();

        // processamento
        salariobruto = valordahoraaula * numerosdehorastrabalhadas;
        descontodoinss = salariobruto * porcentagemdedescontoinss / 100;
        salarioliquido = salariobruto - descontodoinss;

        // saida de dados

        System.out.println(" O salario bruto é: " + salariobruto);
        System.out.println(" Seu salario com desconto de INSS é: " + descontodoinss);
        System.out.println(" O salrio liquido é: " + String.format("%.2f" , salarioliquido));




    }
}
