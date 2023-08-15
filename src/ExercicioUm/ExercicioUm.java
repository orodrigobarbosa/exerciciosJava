package ExercicioUm;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

//1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
        int num1;
        int num2;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        num1 = teclado.nextInt();

        System.out.println("Digite outro numero: ");
        num2 = teclado.nextInt();

        System.out.println("a soma dos numeros é: " + (num1 + num2));

    }
}