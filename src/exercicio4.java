import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaração de variavel
        double salariominimo;
        int qtdkwatt;
        double valorkwatt, conta;

        // entrada de dados
        System.out.println("Informe o valor do salario mininmo");
        salariominimo = sc.nextDouble();

        System.out.println("Informe o valor quantidade de kwatt");
        qtdkwatt = sc.nextInt();

        valorkwatt = salariominimo / 7 / 100;
        conta = qtdkwatt  * valorkwatt;

        System.out.println("Valor da conta: "+ conta);
        System.out.println("Valor do quilowatt: "+ valorkwatt);
        System.out.println("Valor da conta com 10% de desconto: "+ conta * 0.90);














    }
}
