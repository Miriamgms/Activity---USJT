/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao6
{
    public static void main(String[] args) 
    {
        String num = JOptionPane.showInputDialog("Digite um número inteiro:");
        //convertendo
        int numero = Integer.parseInt(num);
        //if indica maior, menor ou igual à 20
        if (numero > 20) 
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é maior que 20");
        }
         if (numero == 20) 
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é igual à 20");
        }
         if (numero < 20) 
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é menor que 20");
        }

    }
}
