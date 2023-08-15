package ExercicioCinco;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        // Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        //No finalinformar o nome do aluno e a sua média (aritmética);
        Scanner entrada = new Scanner(System.in);

        String nome;
        Float nota1;
        Float nota2;
        Float nota3;


        System.out.println("Digite o nome do aluno: ");
        nome = entrada.nextLine();;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextFloat();;

        System.out.println(nome);
        System.out.println("Média: " + ((nota1+nota2+nota3) /3));
    }
}
