package ExercicioQuatro;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
        //por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
        //efetuadas, informar o seu nome, o salário fixo e salário no final do mês

     String vendedor;
     float salario;
     float    vendasMes;
     float comissao = 0.0f;

     Scanner teclado = new Scanner(System.in);


        System.out.println("Digite nome do vendedor: ");
        vendedor = teclado.nextLine();

        System.out.println("Digite o Salário do vendedor: ");
        salario = teclado.nextFloat();

        System.out.println("Digite total de vendas do vendedor no mês:");
        vendasMes = teclado.nextFloat();
        comissao = vendasMes * 0.15f;

        System.out.println("Vendedor: " + (vendedor));
        System.out.println("Salário: " + (salario));
        System.out.println("Total de Vendas: " + (vendasMes));

        System.out.println("Salário + Comissao: " + (salario + comissao));
    }
}
