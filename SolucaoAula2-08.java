/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao8 
{
    public static void main(String[] args) 
    {
        String sNum1 = JOptionPane.showInputDialog("Digite um número:");
        String sNum2 = JOptionPane.showInputDialog("Digite um número:");
        
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
       //convertendo números em int e aplicando no if para válidar condição
        if (num1 > num2) 
        {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } 
        if (num1 < num2)
         {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        }
    }
}

