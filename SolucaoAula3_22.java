/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_22 
{
    public static void main(String[] args)
  {
        // Lê o limite superior
        String sLimSuperior = JOptionPane.showInputDialog("Digite o limite superior:");
        int limite = Integer.parseInt(sLimSuperior);

        StringBuilder impares = new StringBuilder("Números ímpares menores que " + limite + ": ");

        // Laço de repetição para encontrar os números ímpares
        for (int i = 1; i < limite; i += 2)
        {
            impares.append(i).append(", ");
        }

      
        if (impares.length() > 0)
        {
            impares.setLength(impares.length() - 2);
        }

        // Exibe os números ímpares
        JOptionPane.showMessageDialog(null, impares.toString());
    }
}
