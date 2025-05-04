/*
 *  Elaborar um programa que calcule uma raiz de base qualquer com índice qualquer 
 */
package ex16;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double base, indice, raiz;
        
        // Solicita ao usuário a base
        System.out.print("Digite a base da raiz: ");
        base = scan.nextDouble();
        
        // Solicita ao usuário o índice
        System.out.print("\nDigite o índice pra raiz: ");
        indice = scan.nextDouble();
        
        // Não é possível tirar raiz de um número negativo com índice par
        if((base < 0) && (indice % 2 == 0)){
            System.out.println("Não pode ser feita um raiz de um número negativo com índice par");
        }else{
            // Cálculo da raiz usando o expoente fracionário (1/índice)
            // o uso do número 1.0 é para garantir que a divisão seja feita em ponto flutuante
            raiz = Math.pow(base, 1.0/ indice);
        
            // Exibindo resultado
            System.out.printf("%nResultado da raiz: %.2f%n", raiz);  
        }
    }
    
}
