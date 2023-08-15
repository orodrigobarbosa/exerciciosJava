package ExercicioVinteQuatro;

import java.util.Scanner;

public class ExercicioVinteQuatro {


    public static void main(String[] args) {


        //Exercicio de Estrutura de Repeticao
        // Faça um algoritmo que receba um numero e mostra uma mensagem caso este nuymero seja maior que 80, menor que 25
        // ou igual a 40

        Scanner teclado = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um numero: ");

            int numero = teclado.nextInt();

            if (numero == 0) {
                System.out.println("O numero é zero");
            } else {
                if (numero > 0) {
                    System.out.println("O numero é maior que zero");
                } else {
                    System.out.println("O numero é menor que zero");
                }
            }
            //pegar a primeira letra da palavra - pois alguem poderia digitar uma palavra que começa com S, como
            // Sapato... assim o algoritmo pararia logo apos o S ser digitado.
            desejaContinuar = teclado.next().charAt(0);
        }

    }
}
