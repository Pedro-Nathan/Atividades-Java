/*
 * Elaborar um programa que leia uma medida em pés e apresente o seu valor convertido em
 * metros, lembrando que um pé mede 0,3048 metros, ou seja, um pé é igual a 30,48 centímetros.
 */
package ex15;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double pes, metros, centimetros; // Declaração de variáveis do tipo real
        
        
        // Solicita ao usuário o valor em pés
        System.out.print("Informe o valor em pés: ");
        pes = scan.nextDouble();
        
        
        // Valida se o valor é maior que zero
        // Por se tratar de medida pés não deve ser zero ou negativo
        if(pes <= 0){
            // Mensagem de erro
            System.out.println("ERRO O VALOR DE PÉS NÃO DEVE SER ZERO OU NEGATIVO");
        }else{
            metros = pes * 0.3048; // Conversão de pés para metros
            centimetros = metros * 100; // Conversão de metros para centímetros
            
            // Exibe os resultados das conversões
            System.out.println("\nOs Resultados das conversões de pés são: ");
            System.out.printf("Pés para metros: %.4f%n", metros); 
            System.out.printf("Pés para centímetros: %.2f%n", centimetros);
        } 
    }
    
}
