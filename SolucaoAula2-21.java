/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao211
{
    public static void main(String[] args) 
    {
        String sNum1 = JOptionPane.showInputDialog("Digite um número:");
        String sNum2 = JOptionPane.showInputDialog("Digite um número:");
        String sNum3 = JOptionPane.showInputDialog("Digite um número:");

        
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);
       //convertendo números em int e aplicando no if para válidar condição
       
       int maior;
        if (num1 > num2 && num1 > num3)
        {
            maior = num1;
        }
       else if (num2 > num1 && num2 > num3) 
       {
            maior = num2;
        } 
        else
         {
            maior = num3;
        }
 // Exibir o maior número
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}
