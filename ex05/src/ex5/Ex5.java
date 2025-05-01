/*Criar um programa que receba dois números e imprima a sua soma. A saída deverá ser do
tipo: PrimeiroNúmero + SegundoNúmero = SuaSoma (p.ex. 3+2=5)*/

package ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeiroNum, segundoNum, suaSoma;
        
        System.out.print("\nDigite o primeiro número: ");
        primeiroNum = scan.nextInt();
        System.out.print("\nDigite o segundo número: ");
        segundoNum = scan.nextInt();
        
        // Definindo o valor da variável "suaSoma" com a soma das duas variáveis 
        suaSoma = primeiroNum + segundoNum;
        
        //Mostrando sua soma
        System.out.println("\nA soma do primeiro número com o segundo número é: "+ suaSoma);
    }
}
