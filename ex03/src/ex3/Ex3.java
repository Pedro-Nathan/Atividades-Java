/*Criar um programa que receba um número inteiro e imprima o seu antecessor e o seu sucessor*/

package ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, antecessor, sucessor;
        
        System.out.print("Digite um número: ");
        num = scan.nextInt();
        
        antecessor = num - 1; // Para o número antecessor é só colocar -1
        sucessor = num + 1; // Para o número sucessor é so colocar + 1
        
        System.out.println("\nO antecessor do número "+ num +" é: "+ antecessor); // Mostrando o valor do número antecessor digitado
        System.out.println("O sucessor do número "+ num +" é: "+sucessor); // Mostrando o valor do número sucessor digitado
        
    }
}
