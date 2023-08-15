package ExericicioDois;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {


        //     2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
        //  dos dois números lidos;


        int num1;
        int num2;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = leitor.nextInt();

        System.out.println("A soma dos numeros é: " + (num1+num2));
        System.out.println("A subtração dos numeros e: " + (num1-num2));
        System.out.println("A multiplicacao dos numeros é: " + (num1*num2));
        System.out.println("A divisão dos numeros é: " + (num1/num2));
    }
}
