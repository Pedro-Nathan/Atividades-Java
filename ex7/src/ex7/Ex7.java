/*Informar três números e imprimir a média*/

package ex7;
public class Ex7 {
    public static void main(String[] args) {
        double num1 = 10, num2 = 4, num3 = 6, media;
        
        // Informando as notas
        System.out.println("1º nota: "+num1);
        System.out.println("2º nota: "+num2);
        System.out.println("3º nota: "+num3);
        
        // Calculando a meida
        media = (num1 + num2 + num3) / 3; // Priorizando a soma das notas com "()" para dividir por 3
        
        // Informando o resultado da media 
        System.out.printf("A media das 3 notas é: %.2f%n", media); // "%n" É um caractere de nova linha utilizado no printf para quebrar linha
    }
}
