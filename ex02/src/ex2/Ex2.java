/*Criar um programa que receba um número e o imprima na tela com a mensagem “O número digitado é: ” */

package ex2;

import java.util.Scanner; // Importando a classe Scanner para permitir a entrada de dados pelo teclado

public class Ex2 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); // Criando o objeto Scanner
        int num; // Definindo a variável 'num' do tipo inteiro
        
        // "print" só escreve e fica na mesma linha; "println" escreve e já quebra a linha pra próxima
        System.out.print("\nDigite um número: "); // O "\n" é uma sequência de escape usada para pular linha
        num = scan.nextInt(); // Recebendo o valor digitado pelo usuário e armazenando em 'num'
        
         // Ao colocar "+ num" depois da mensagem entre aspas, estou indicando que o valor da variável será exibido junto com o texto
        System.out.println("O número digitado é: " + num); // Exibindo o valor armazenado
        
    }
}
