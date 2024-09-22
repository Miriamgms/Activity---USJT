/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao8 
{
    public static void main(String[] args) 
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
       //convertendo números em int e aplicando no if para válidar condição
        if (num1 > num2) 
        {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
        } 
        else
         {
            JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
        }
    }
}
