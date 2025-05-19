/*
 *  Faça um programa, usando o comando switch, em que receba um número 
 *  de 1 a 7 e retorne   o dia da semana.
 */
package ex21;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Declara a variável que armazenará o número do dia da semana.
        int semana;
        
        // Solicita que o usuário digite um número entre 1 e 7.
        System.out.print("Digite um número entre 1 e 7 para um dia da semana: ");
        semana = scan.nextInt();
        
        // Usa switch moderno para mostrar o dia da semana.
        switch (semana) {
            case 1 ->{
                System.out.println("O dia da semana correspondente ao número " + semana + " é Domingo.");
            }
            case 2 ->{
                System.out.println("O dia da semana correspondente ao número " + semana + " é Segunda-feira.");
            }
            case 3 ->{
                System.out.println("O dia da semana correspondente ao número " + semana + " é Terça-feira.");
            }
            case 4 ->{
                System.out.println("O dia da semana correspondente ao número " + semana + " é Quarta-feira.");
            }
            case 5 ->{
                System.out.println("O dia da semana correspondente ao número " + semana + " é Quinta-feira.");
            }
            case 6 ->{
                System.out.println("O dia da semana correspondente ao número " + semana + " é Sexta-feira.");
            }
            case 7 ->{
                System.out.println("O dia da semana correspondente ao número " + semana + " é Sábado.");
            }
            
            default ->{
                // Mensagem para número inválido.
                System.out.println("O número " + semana + " é inválido.");
            }
        }
    }
}
