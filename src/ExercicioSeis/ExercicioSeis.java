package ExercicioSeis;

import java.util.Scanner;
public class ExercicioSeis {
    public static void main(String[] args) {

        //Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
        //possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
        //trocados
Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o valor de A: ");
        int a = teclado.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = teclado.nextInt();

        int trocaValores = a;

        a = b;
        b = trocaValores;

        System.out.println("Os valores foram trocados para: ");
        System.out.println("A: " + a);
        System.out.println("B: "+ b);


        teclado.close();






    }
}
