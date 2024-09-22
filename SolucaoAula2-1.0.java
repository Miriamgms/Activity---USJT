/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao10
{
    public static void main(String[] args) 
    {
    String sNumero = JOptionPane.showInputDialog("Digite um número:");
    //convertendo para int
        int numero = Integer.parseInt(sNumero);
  
        if (numero % 5 == 0) 
        {
            JOptionPane.showMessageDialog(null, numero + " é divisível por 5.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, numero + " não é divisível por 5.");
        }
    }
}
