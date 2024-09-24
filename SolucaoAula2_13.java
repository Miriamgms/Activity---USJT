/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class SolucaoAula2_13
{
    public static void main(String[] args) 
    {
        // Entrar com um número de 3 dígitos
        String sNumero = JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos:");
        int numero = Integer.parseInt(sNumero);
        
        // Verifica se o número tem 3 dígitos
        if (numero < 100 || numero > 999) {
            JOptionPane.showMessageDialog(null, " ");
            // segue
        }
        
        // Extrai o algarismo das dezenas
        int dezenas = (numero / 10) % 10;

        // Verifica se o algarismo das dezenas é par ou ímpar
        if (dezenas % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas (" + dezenas + ") é par.");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas (" + dezenas + ") é ímpar.");
        }
    }
}
