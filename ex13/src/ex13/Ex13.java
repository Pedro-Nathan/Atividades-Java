/*
 *  Elaborar um programa de computador que calcule e apresente o valor do volume de uma
 *  esfera
 */
package ex13;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double raio, volume;
        
        // Solicitando o valor de raio
        System.out.print("Informe o valor do raio da esfera: ");
        raio = scan.nextDouble();
        
        
        // Caso o valor de raio seja zero ou negativo o Math.pow() pode retornar NaN(Not a Number)
        if(raio <= 0){
            // Mensagem de erro
            System.out.println("\n!!ERRO RAIO INVÁLIDO, O RAIO DEVE SER MAIOR QUE ZERO!!");
        }else{
            // Calculando valor do volume da esfera
            // O "Math.pow(double base, double exponent)" é um método que calcula a potência de um número
            volume = (4.0 / 3.0 ) * 3.14159 * Math.pow(raio, 3);
            
            // Exibindo o Resultado 
            System.out.printf("%nO Resultado do volume da esfera é: %.2f%n", volume);
        }
    }
    
}
