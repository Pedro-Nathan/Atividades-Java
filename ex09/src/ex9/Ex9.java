/*
 * Informar o ano de nascimento e imprimir a idade da pessoa
 */
package ex9;
    
import java.util.Scanner;

public class Ex9 { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int idade, anoNascimento, anoAtual;
        
        // Receber ano Atual 
        System.out.print("Informe seu ano Atual (2025): ");
        anoAtual = scan.nextInt();
        
        // Receber ano de Nascimento
        System.out.print("\nInforme seu ano de Nascimento (2000): ");
        anoNascimento = scan.nextInt();
        
        // Caso o ano de nascimento for maior que o ano de ano atual
        if(anoNascimento > anoAtual){
            System.out.println("\nVocê ainda não veio ao Mundo ");
        }else if(anoNascimento == anoAtual){ // Caso o ano de nascimento for igual ao ano de ano atual
            System.out.println("\nVocê tem menos de 1 Ano de idade");
        }else{
            // Calculando Idade
            idade = anoAtual - anoNascimento;
            
            //Informando a Idade
            System.out.println("\nSua idade é: " + idade);
        }
    }
    
}
