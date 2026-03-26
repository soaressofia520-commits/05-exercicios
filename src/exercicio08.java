import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variavel
        int numero1;
        int numero2;
        int numero3;

        // entrada de dados
        System.out.println("Digite um numero com três digitos: ");
        numero1 = sc.nextInt();

        // processamento
        numero2 = numero1 % 100;
        numero3 = numero2 / 10;

        // saida de dados
        System.out.println("Seu numero é: " + numero3);
    }

}
