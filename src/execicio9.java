import java.util.Scanner;

public class execicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variavel

        int valordousuario;
        int unidade;
        int dezena;
        int centena;
        int valorfinal;

        // entrada de dados
        System.out.println("Digite um valor com 3 digitos");
        valordousuario = sc.nextInt();

        //processamento

         unidade= valordousuario%10;
         dezena = valordousuario/10 %10;
         centena = valordousuario/100;
         valorfinal = unidade * 100 + dezena * 10 + centena;



         //saida de dados
        System.out.println("Valor invertido: " + valorfinal);
        System.out.println(unidade + "" + dezena + "" + centena);




    }
}
