package ExercicioQuinze;

import java.util.Scanner;

public class ExercicioQuinze {

    public static void main(String[] args) {
        //faca um algoritmo que escreve um numero e diga se esse numero está entre 100 e 200

        int numero;

        Scanner leitorScanner = new Scanner(System.in);


        System.out.println("Digite um número");
        numero = leitorScanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O numero está entre 100 e 200");
        } else {
            System.out.println("O numero nao está entre 100 e 200");
        }


    }
}
