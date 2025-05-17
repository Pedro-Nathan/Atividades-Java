/* Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
* utilizando um automóvel que faz 12 quilômetros por litro. Para obter o 
* cálculo, o usuário deve fornecer o tempo gasto (variável TEMPO) e a 
* velocidade média (variável velocidade)durante a viagem. Desta forma, será 
* possível obter a distância percorrida com a fórmula DISTÂNCIA= TEMPO *VELOCIDADE.
* A partir do valor da distância, basta calcular a quantidade de litros de
* combustível utilizada na viagem com a fórmula LITROS USADOS= DISTÂNCIA/ 12.
* O programa deve apresentar os valores da velocidade média, tempo gasto na 
* viagem, a distância percorrida e a quantidade de litros utilizada na viagem.
*/
package ex19;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double tempo, velocidade, distancia, litrosUsados;
        
        System.out.print("\nInforme o tempo gasto na viagem em horas: ");
        tempo = scan.nextDouble();
        
        System.out.print("\nInforme a velocidade média durante a viagem: ");
        velocidade = scan.nextDouble();
        
        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;
        
        System.out.printf("\nA velocidade média foi de %.0f km/h%n", velocidade);
        System.out.printf("O tempo gasto na viagem foi de %.0f horas%n", tempo);
        System.out.printf("A distância percorrida foi de %.0f km%n", distancia);
        System.out.printf("A quantidade de litros utilizada foi de %.2f litros%n", litrosUsados);
        
    }
}
