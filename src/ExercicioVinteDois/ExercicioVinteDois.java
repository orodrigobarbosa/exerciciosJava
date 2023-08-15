package ExercicioVinteDois;

import java.util.Scanner;

public class ExercicioVinteDois {
    public static void main(String[] args) {
//        Algoritmo que receba preco de custo e preco de venda de 40 produtos
//        Mostre como resultado se houve lucro, prejuizo ou empate para cada
//        produto. Informa o valor de custo de cada produto, o valor de venda de cada
//        produto, a media de preco e custo e preco de venda.

        //EXERCICIO USANDO ESTRUTURA FOR


        float precoCusto;
        float precoVenda;
        String nomeProduto;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner teclado = new Scanner(System.in);
        int i = 0;
        for (; i < 2; i++) {
            System.out.println("Digite o nome do produto: ");
            nomeProduto = teclado.nextLine();

            System.out.println("Digite custo do produto: ");
            precoCusto = teclado.nextFloat();

            System.out.println("Digite o preço da venda: ");
            precoVenda = teclado.nextFloat();

            teclado.nextLine(); // Limpar o buffer após a leitura do preço de venda

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;


            if (precoCusto == precoVenda) {
                System.out.println("Houve empate entre os precos de custo e venda");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Prejuizo");
                } else {
                    System.out.println("Lucro");

                }
            }
            System.out.println((nomeProduto + ", preco de custo = " + precoCusto + ", preco de venda = " + precoVenda));

        }

        System.out.println("A media do preco de custo é de: " + (totalCusto / i));
        System.out.println("A media do preco de custo é de: " + (totalVenda / i));
    }
}
