/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class SolucaoAula2_09
 {
    public static void main(String[] args) 
    {
        String sNumero = JOptionPane.showInputDialog("Digite um número:");
     //convertendo para int
        int numero = Integer.parseInt(sNumero);
     // utilizando if e else para válidar condição
        if (numero  %  3  ==  0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é múltiplo de 3.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, numero + " não é múltiplo de 3.");
        }
    }
}

 /* O operador % é o operador de módulo em Java. Ele retorna o resto da divisão de um número pelo outro. No código acima, numero % 3 verifica se o resto da divisão de numero por 3 é igual a 0.
  Se for, isso significa que numero é múltiplo de 3*/
