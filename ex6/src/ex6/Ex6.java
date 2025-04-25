/*
Criar um programa que receba 2 números e imprima a divisão deles. A saída deverá ser no
modelo do exercício anterior. Se não for possível a divisão, informar ao usuário!
 */

package ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double primeiroNum, segundoNum, suaDivisao;
        
        // Entrada dos números
        System.out.print("\nDigite o 1º número: ");
        primeiroNum = scan.nextDouble();
        System.out.print("\nDigite o 2º número: ");
        segundoNum = scan.nextDouble();
        
        // Verificando se o segundo número é diferente de 0
        // A divisão só pode ser feita se o segundo número (divisor) for diferente de 0.
        if(segundoNum != 0) {
            // Fazendo a divisão de números
            suaDivisao = primeiroNum / segundoNum;
            
            // Mostrando o resultado
            // "printf" Exibir informações com formatação específicas como "%.2f"
            // "%" indica que vai vir uma variável formatada
            // ".2" define que serão exibidas 2 casas decimais
            // "f" indica que o tipo do valor é float ou double
            System.out.printf("\nO resultado da divisão entre o 1º e 2º número é: %.2f ", suaDivisao);
        }else{
            System.out.println("\nNão foi possível a divisão");
        }
    }
}
