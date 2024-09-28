/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_16 
{
    public static void main(String[] args) 
    {
        // Entrada de número
        int f = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        //valor inicial da sequência de fibonacci
        int a = 0, b = 1;

        // Calcula o valor de Fibonacci na posição f
        int fib = 0; // Para armazenar o valor de Fibonacci na posição f

        // Se n for 0, o resultado é 0
        if (f == 0) 
        {
            fib = 0;
        }
         else if (f == 1) 
         {
          // Se n for 1, o resultado é 1
            fib = 1;
        } 
        else
         {
            for (int i = 2; i <= f; i++) {
                fib = a + b; // Calcula o próximo número na sequência
                a = b; // Atualiza a
                b = fib; // Atualiza b
            }
        }

        // Exibe o valor de Fibonacci na posição f
        JOptionPane.showMessageDialog(null, "O valor de Fibonacci para a posição " + f + " é: " + fib);
    }
}
