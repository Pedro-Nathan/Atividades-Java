/*
 * Usando o comando switch, escreva um programa que leia um inteiro entre 1 e 
 * 12 e imprima o mês correspondente a este número. Isto é, janeiro se 1,
 * fevereiro 2 e assim por diante.
 */
package ex20;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Declara a variável que armazenará o número do mês.
        int mes;
        
        // Solicita que o usuário digite um número entre 1 e 12.
        System.out.print("Digite um número entre 1 e 12 para o mês: ");
        mes =  scan.nextInt();
        
        
        // Utilizando switch case moderno para exibir o mês correspondente
        switch (mes) {
            case 1 -> {
                System.out.println("O mês correspondente ao número " + mes + " é Janeiro.");
            }
            case 2 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Fevereiro.");
            }
            case 3 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Março.");
            }
            case 4 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Abril.");
            }
            case 5 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Maio.");
            }
            case 6 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Junho.");
            }
            case 7 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Julho.");
            }
            case 8 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Agosto.");
            }
            case 9 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Setembro.");
            }
            case 10 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Outubro.");
            }
            case 11 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Novembro.");
            }
            case 12 ->{
                System.out.println("O mês correspondente ao número " + mes + " é Dezembro.");
            }
            default -> {
                // Mensagem para número inválido.
                System.out.println("O número "+ mes +" é inválido.");
            }
        }
    }  
}
