/*
Informar um preço de um produto. Se pagamento à vista calcular o desconto de 10% e
mostrar o novo valor.. Se a venda for no cartão de crédito, realizar o desconto de 5% e
mostrar o novo valor.
 */

package ex8;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int cod; // Código do produto escolhido
        double pro1 = 4000, pro2 = 6000, desc; // Preços dos produtos e o desconto
        String forma; // Forma de pagamento 
        
        // Exibindo a tabela de produtos com seus códigos e valores
        System.out.println("Escolha um produto:");
        System.out.printf("%-10s %-15s %-10s %2s%n", "|COD|", "|PRODUTO  |", "|VALOR", "|");
        System.out.println("---------------------------------------");
        System.out.printf("%-10s %-15s |R$%-8.2f %1s%n", "|001|", "|Fogão    |", pro1 ,"|");
        System.out.printf("%-10s %-15s |R$%-8.2f %1s%n", "|002|", "|Geladeira|", pro2 , "|");
        
        // Entrada: Código do produto
        System.out.print("\nDigite o código do Produto: ");
        cod = scan.nextInt();
        
        // "switch" é uma estrutura condicional que testa uma variável com múltiplos valores possíveis de maneira mais eficiente do que com múltiplos if e else if
        // "case" define uma opção específica que o switch vai testar
        switch (cod) { 
            case 1 -> {
                // Caso o código do produto seja 1 (Fogão)
                System.out.printf("%nFogão de R$%.2f%n", pro1);
                System.out.print("\nEscolha a forma de pagamento (vista ou crédito): ");
                forma = scan.next();
                // Adicionando descontos conforme a forma de pagamento
                if (forma.equalsIgnoreCase("vista")) {
                    desc = pro1 * 0.10; // Desconto de 10% à vista
                    pro1 = pro1 - desc;
                    System.out.printf("\nO valor total do produto com desconto de 10%%, à vista é: R$%.2f%n", pro1);
                } else if(forma.equalsIgnoreCase("crédito")){
                    desc = pro1 * 0.05; // Desconto de 5% no cartão de crédito
                    pro1 = pro1 - desc;
                    System.out.printf("\nO valor total do produto com desconto de 5%% no cartão de crédito é: R$%.2f%n", pro1);
                }else{
                    System.out.println("!!Forma de pagamento indisponível!!");
                }
            }
            case 2 -> {
                // Caso o código do produto seja 2 (Geladeira)
                System.out.printf("%nGeladeira de R$%.2f%n", pro2);
                System.out.print("\nEscolha a forma de pagamento (vista ou crédito): ");
                forma = scan.next();
                
                // Adicionando descontos conforme a forma de pagamento
                if(forma.equalsIgnoreCase("vista")){
                    desc = pro2 * 0.10; // Desconto de 10% à vista
                    pro2 = pro2 - desc;
                    System.out.printf("\nO valor total do produto com desconto de 10%%, à vista, é: R$%.2f%n", pro2);
                }else if(forma.equalsIgnoreCase("crédito")){
                    desc = pro2 * 0.05; // Desconto de 5% no cartão de crédito
                    pro2 = pro2 - desc;
                    System.out.printf("\nO valor total do produto com desconto de 5%% no cartão de crédito, é: R$%.2f%n", pro2);
                }else{
                    System.out.println("!!Forma de pagamento indisponível!!");
                }
            }
            default -> // Caso o código inserido não corresponda a nenhum produto disponível, o bloco 'default' é executado
                System.out.println("!!CÓDIGO INDISPONÍVEL!!");
        }
    } 
}
