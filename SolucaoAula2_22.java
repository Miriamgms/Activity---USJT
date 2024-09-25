/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class SolucaoAula2_22
{
    public static void main(String[] args)
    {
        // Entrada de números
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String sNum3 = JOptionPane.showInputDialog("Digite o terceiro número:");

        // Converter as entradas para int
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);

        // Declarar a variável maior
        int maior;

        // Verificar qual é o maior número
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
