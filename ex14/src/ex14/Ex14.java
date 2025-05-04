/*
 *  Elaborar um programa que leia dois valores numéricos inteiros, os quais devem representar
 *  a base e o expoente de uma potência, calcule a potência e apresente o resultado obtido.
 */
package ex14;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int base, expoente;
        double potencia; 
        // Defenindo potencia como double por conta do método math.pow() para não ter erro de compilação
        
        // Solicitando a base
        System.out.println("\nDigite a base da potência: ");
        base = scan.nextInt();
        
        // Solicitando o expoente
        System.out.println("Digite o expoente da potência: ");
        expoente = scan.nextInt();
        
        //Não é possível calcular 0 elevado a um expoente negativo
        if((base == 0) && (expoente < 0)){
            System.out.println("ERRO: Não use base 0 com expoente negativo, pois isso não é permitido matematicamente");
        }else{
            // Exibindo e calculando a potência 
            potencia = Math.pow(base, expoente);
            System.out.println("resultado: "+ potencia);
        }    
    }
    
}
