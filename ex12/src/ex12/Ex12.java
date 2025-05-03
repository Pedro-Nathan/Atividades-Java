/*
 *  Construir um programa que calcule e apresente em metros por segundo o valor da
 *  velocidade de um projétil que percorre uma distância de quilômetros a um espaço de tempo
 *  em minutos.
 */
package ex12;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double velocidade, distancia, tempo;
        
        // Informando ao usuário como inseri as informações 
        System.out.println("Informe a distância em quilômetros e o tempo em minutos\n");
        
        System.out.println("Cálculo da velocidade de um projétil (m/s)");
        // Solicitando distância
        System.out.print("Informe a distância percorrida (em km): ");
        distancia = scan.nextDouble();
        
        // Solicitando tempo
        System.out.print("\nInforme o tempo gasto (em minutos): ");
        tempo = scan.nextDouble();
        
        // Caso os valores sejam 0 ou negativos, não é possível calcular a velocidade
        // Um projétil com valor 0 ou negativo, não pecorre nada
        if((distancia <= 0) || (tempo <= 0)){
            // Mensagem de erro
            System.out.println("As informações não podem ser zero ou negativas");
        }else{
            // Calculando e exibindo a velocidade do projétil
            velocidade = (distancia * 1000) / (tempo * 60);
            System.out.printf("%nA velocidade do projétil é : %.2f m/s%n", velocidade);
        }
        
    }
    
}
