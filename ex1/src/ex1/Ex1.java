/* Criar um programa que imprima a mensagem de saudação “Olá MUNDO!!”*/
package ex1;
public class Ex1 { // Nome da minha classe 
    
    // "public" Permite que o método seja acessado pela JVM de fora da classe
    // "static" O método pode ser executado sem criar um objeto da classe
    // "void" O método não retorna nenhum valor
    // "main" é o nome fixo que a JVM procura para iniciar o programa
    // "String[] args" Parâmetro padrão do método main que armazena os argumentos passados na execução do programa
    public static void main(String[] args) {
        
        System.out.println("Olá MUNDO!!");//"System" indica o sistema "out" representa a sainda "println" imprime a mensagem e pula uma linha
        
    }
}
