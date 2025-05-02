/*
 *  Elaborar um programa que calcule e apresente o valor do volume de uma caixa retangular
 */ 
 
package ex11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double volume, comprimento, largura, altura;
        
        // Informando ao usuário que não se devem usar 0 ou números negativos
        System.out.println("!!Digite as dimensões da caixa retangular\\nAs dimensões não podem ser negativas ou zero!!");
        System.out.println("Não existe caixa de altura 0 ou largura 0. Se ela não tem tamanho, ela não existe.");
        
        // Solicitando as dimensões da caixa
        // Solicitando comprimento
        System.out.print("\nDigite o comprimento da caixa: ");
        comprimento = scan.nextDouble();
        
        // Solicitando Largura
        System.out.print("\nDigite a largura da caixa: ");
        largura = scan.nextDouble();
        
        // Solicitando Altura
        System.out.print("\nDigite a altura da caixa: ");
        altura = scan.nextDouble();

        // Caso os valores sejam 0 ou negativos, não é possível calcular o volume
        // Uma caixa com valor 0 ou negativo não existe fisicamente
        if((comprimento <= 0) || (largura <= 0)  || (altura <= 0)){
            // mensagem de erro 
            System.out.println("\n!!ATENÇÃO!! As dimensões não podem ser zero ou negativas.");
            
        }else{
            // Exibindo o resultado do volume da caixa
            volume = comprimento * largura * altura;
            System.out.printf("%nO Resultado do volume da caixa é: %.2f%n", volume);
        }
        
        // Explicção dos operadores relacionais e lógicos
        
        //  "=="  verifica se dois valores são iguais
        //  "!="  verifica se dois valores são diferentes
        //  ">"   verifica se um valor é maior que o outro
        //  "<"   verifica se um valor é menor que o outro
        //  ">="  verifica se um valor é maior ou igual ao outro
        //  "<="  verifica se um valor é menor ou igual ao outro

        //  "&&"  verifica se todas as condições são verdadeiras (AND lógico)
        //  "||"  verifica se pelo menos uma condição é verdadeira (OR lógico)
        //  "!"   inverte o resultado de uma condição (NOT lógico)
    }
    
}
