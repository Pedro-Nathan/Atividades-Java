/*
 * Ler dois valores numéricos inteiros (representados pelas variáveis A e B) 
 * e apresentar o resultado do quadrado da divisão do primeiro valor 
 * (variável A) em relação ao segundo valor (variável B).
 */
package ex18;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Declarando variáveis
        int a, b;
        double resultado;
        
        // Solicita ao usuário o valor de A
        System.out.print("\nDigite O valor de A: ");
        a = scan.nextInt();
        // Solicita ao usuário o valor de B
        System.out.print("\nDigite O valor de B: ");
        b = scan.nextInt();
        
        // Calculando resultado do quadrado
        resultado = Math.pow((a / b ), 2);
        
        // Exebindo resultado 
        System.out.println("\nO resultado quadrado é: "+ resultado);
    }
}
