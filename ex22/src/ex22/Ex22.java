/*
 * Uma importadora importa produtos de vários países. O preço do frete varia de acordo
 * com o país, seguindo a tabela abaixo. Faça um programa que receba o valor de um produto, 
 * o país de origem (imprima as opções possíveis em um menu) e imprima o valor total do
 * produto mais frete.
 * País  | Estados Unidos | França | México | Argentina | China |
 * Frete |      60,00     | 75,50  | 50,00  |   27,35   | 80,00 |
 */
package ex22;


import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Declara a variável que armazenará o valor do produto.
        double valorProduto;
        
        // Solicita que o usuário digite o valor do produto.
        System.out.println("Informe o valor do seu produto.");
        System.out.print("valor do produto: ");
        valorProduto = scan.nextDouble();
        scan.nextLine(); // // Limpa o buffer do teclado.
        
        // O "nextDouble()" deixa o Enter (\n) no buffer.
        // É só usar "nextLine()" depois para limpar o buffer e evitar problemas na leitura seguinte.
        
        // Exibe a tabela de opções de países e valores de frete.
        System.out.print("\nEscolha o país de origem: ");
        System.out.print("\n+---------------------------------------------------------------+");
        System.out.printf("%n| %-6s | %-15s| %-7s| %-7s| %-10s| %-6s| %n", "País ", "Estados Unidos", "França", "México", "Argentina", "China");
        System.out.println("+--------+----------------+--------+--------+-----------+-------+");
        System.out.printf("| %-6s | %9s %6s %5s %2s %6s %1s %7s %3s %5s %1s %n", "Frete", "60,00", "|", "75,50", "|", "50,00", "|", "27,35", "|", "80,00", "|");
        System.out.println("+---------------------------------------------------------------+");
        
        // Solicita o país ao usuário
        System.out.print("\nInforme o país de sua escolha: ");
        String pais = scan.nextLine().trim().toLowerCase();
        
        // Usa switch moderno para mostrar o resultado do frete. 
        switch (pais) {
            case "estados unidos" ->{
                System.out.printf("Valor do produto: R$%.2f. %n", valorProduto);
                System.out.printf("Valor total do produto com frete: R$%.2f. %n", valorProduto + 60.00);
            }
            case "frança", "franca" ->{
                System.out.printf("Valor do produto: R$%.2f. %n", valorProduto);
                System.out.printf("Valor total do produto com frete: R$%.2f. %n", valorProduto + 75.50);
            }
            case "méxico", "mexico" ->{
                System.out.printf("Valor do produto: R$%.2f. %n", valorProduto);
                System.out.printf("Valor total do produto com frete: R$%.2f. %n", valorProduto + 50.00);
            }
            case "argentina" ->{
                System.out.printf("Valor do produto: R$%.2f. %n", valorProduto);
                System.out.printf("Valor total do produto com frete: R$%.2f. %n", valorProduto + 27.35);
            }
            case "china" ->{
                System.out.printf("Valor do produto: R$%.2f. %n", valorProduto);
                System.out.printf("Valor total do produto com frete: R$%.2f. %n", valorProduto + 80.00);
            }
            default ->{
                // Mensagem para País inválido
                System.out.println("País inválido");
            }
        }
    }
}
