/*Crie um programa que contenha 3 variáveis, uma int, outra float e a última double. Mostre os endereços de memória de cada uma delas.*/

package ex4;

public class Ex4 {
    public static void main(String[] args) {
        int intvar = 10;
        float floatvar = 2.2f; // sufixo f para diferenciar um literal float de um double
        double doublevar = 3.33;
        
       
        // Atribuindo valores de texto às variáveis do tipo "String" e concatenando-os com o operador "+" 
        // Junto com a função "System.identityHashCode()" para obter o hashcode único de cada variável.
        
        String intvarAddress = "Endereço de intvar(Hashcode): "+ System.identityHashCode(intvar); // Obtendo o hashcode da variável intvar (identificador único na memória)
        String floatvarAddress = "Edereço de floatvar(Hashcode): "+ System.identityHashCode(floatvar); // Obtendo o hashcode da variável floatvar (identificador único na memória)
        String doublevarAddress = "Edereço de doublevar(Hashcode): "+ System.identityHashCode(doublevar); // Obtendo o hashcode da variável doublevar (identificador único na memória)
        
        
        // Mostrando os valores e os Endereços HashCode das Variáveis
        System.out.println("\nValor de intvar: "+ intvar);
        System.out.println(intvarAddress);
        System.out.println("\nValor de floatvar: "+ floatvar);
        System.out.println(floatvarAddress);
        System.out.println("\nValor de doublevar: "+ doublevar);
        System.out.println(doublevarAddress);
          
    }
}
