/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao16
{
    public static void main(String[] args) 
    {
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");

        // Converter em int
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        //if e else para verificar se são iguais
        if ( num1 == num2)
        {
         JOptionPane.showMessageDialog(null, "Os números são iguais!");
        }
        else
        {
         JOptionPane.showMessageDialog(null, "Os números não são iguais!");
        }
      
      }
    }    
