/*Aula: 03
Estruturas de Repetição: laços while, do-while e for
import javax.swing.JOptionPane;*/


import javax.swing.JOptionPane;

public class SolucaoAula3_08
{
    public static void main(String[] args) 
    {
        StringBuilder numeros = new StringBuilder();
        long produto = 1; 
        
        // Loop para os números de 120 a 300
        for (int i = 120; i <= 300; i++) 
        {
            produto *= i; 
         

            // Adiciona o número ao StringBuilder
            numeros.append(i);

            // Adiciona um hífen após o número, exceto após o último número (300)
            if (i < 300)
             {
                numeros.append(" - ");
            }

            // A cada 20 números, adiciona uma nova linha
            if ((i - 119) % 20 == 0) { 
                 numeros.append("\n");
            }
        }

        // Exibe os números acumulados
        JOptionPane.showMessageDialog(null, numeros.toString(), "Números (120 a 300)", JOptionPane.INFORMATION_MESSAGE);
        
        // Exibe o produto total
        JOptionPane.showMessageDialog(null, "Produto dos números de 120 a 300: " + produto, "Produto", JOptionPane.INFORMATION_MESSAGE);
    }
}
