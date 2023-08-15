package ExercicioVinte;

import java.util.Scanner;


public class ExercicioVinte {
    public static void main(String[] args) {


        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;

        Scanner leitor = new Scanner(System.in);

        char desejaRepetir = 's';

        while (desejaRepetir == 'S' || desejaRepetir == 's') {

            System.out.println("Digite o ano de fabricacao do veiculo: ");
            anoFabricacao = leitor.nextInt();

            System.out.println("Digite o valor do veiculo: ");
            valorVeiculo = leitor.nextFloat();

            if (anoFabricacao <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;

            }
            totalCarros++;


            valorDesconto = valorVeiculo * porcentagemDesconto;
            valorPagar = valorVeiculo - valorDesconto;
            System.out.println("Valor do Desconto: " + valorDesconto);
            System.out.println("O valor a ser pago é: " + valorPagar);


            System.out.println("Deseja fazer outro cadastro? S - Sim / N - Não");
            desejaRepetir = leitor.next().charAt(0);

            System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);

            System.out.println("Total de carros: " + totalCarros);


        }
    }
}
