package ExercicioTres;
import java.util.Scanner;
public class ExercicioTres {

    public static void main(String[] args) {
//        Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
  //      total percorrida pelo automóvel e o total de combustível gasto;

        float distanciaTotal;
        float combustivelGasto;
        float consumoMedio = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a distancia total percorrida: ");
        distanciaTotal = teclado.nextFloat();

        System.out.println("Informe a quantidade de combustível gasta: ");
        combustivelGasto = teclado.nextFloat();

        consumoMedio = (distanciaTotal/combustivelGasto);

        System.out.println("O consumo Médio é de " + consumoMedio + " litros por KM");



       }
}
