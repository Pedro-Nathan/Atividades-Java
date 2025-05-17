/*
 * Faça um programa que mostre o resto da divisão de um número inteiro por 2 e por 3.
 */
package ex17;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Declarando variável do tipo inteiro
        int num;
        
        // Solicita ao usuário um número
        System.out.print("\nDigite um número: ");
        num = scan.nextInt();
        
        // "%" o operador módulo serve para retorna o resto da divisão entre dois números
        // Calulando e exibindo o resultados
        System.out.println(num + " dividido por 2 tem resto: " + num % 2);       
        // Calulando e exibindo o resultados
        System.out.println(num + " dividido por 3 tem resto: " + num % 3);
    }
}
