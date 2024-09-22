/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao5
{
    public static void main(String[] args) 
    {
        String num = JOptionPane.showInputDialog("Digite um número inteiro:");
        //convertendo
        int numero = Integer.parseInt(num);
        //if indica maior ou igual à 20 OU menor ou igual à 90
        if (numero >= 20 && numero <= 90) 
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " está entre 20-90.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não está entre 20-90.");
        }
    }
}
