/*
 *  Crie um programa que recebe uma temperatura em graus Celsius e apresentá-la convertida
 *  em graus Fahrenheit, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */
package ex10;

import java.util.Scanner;
        
public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c, f;
        
        // Receber a temperatura de Celsius
        System.out.print("\nInsira o grau Celsius (5,55): ");
        c = scan.nextFloat();
        
        // Convertendo a temperatura de Celsius para Fahrenheit
        f = (9 * c + 160) / 5;
        
        // Ixibindo resultado
        System.out.printf("O resultado  da conversão é : %.2f%n", f);
    }
    
}
