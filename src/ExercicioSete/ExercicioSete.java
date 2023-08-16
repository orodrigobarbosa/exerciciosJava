package ExercicioSete;
import java.util.Scanner;
public class ExercicioSete {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
        //conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;

        int celsius = 0;
        float fahrenheit = 0.0f;

        System.out.println("Digite uma temperatura em Celsius (C): ");
         celsius = entrada.nextInt();

         fahrenheit = (9*celsius+160)/5;
        System.out.println("A temperatura digitada convertida para Fahrenheit é: " + fahrenheit);







    }
}
