/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_18
 {
    public static void main(String[] args)
     {
        // Entrada de valores
        String sLinferior = JOptionPane.showInputDialog("Digite o limite inferior (em Celsius):");
        String sLiSuperior = JOptionPane.showInputDialog("Digite o limite superior (em Celsius):");
        String sIncremento = JOptionPane.showInputDialog("Digite o incremento (em Celsius):");

        // Convertendo
        int inf = Integer.parseInt(sLinferior);
        int su = Integer.parseInt(sLiSuperior);
        int inc = Integer.parseInt(sIncremento);


        // Calculando elementos na tabela
        int tamanho = (su - inf) / inc + 1;

        // Inicializa os arrays
        double[] celsius = new double[tamanho];
        double[] fahrenheit = new double[tamanho];

        // Preenche os arrays com valores de Celsius e suas conversões para Fahrenheit
        for (int i = 0; i < tamanho; i++)
         {
            celsius[i] = inf + i * inc;
            fahrenheit[i] = (celsius[i] * 9 / 5) + 32; // Conversão para Fahrenheit
        }

        // Montar a tabela com StringBuilder
        StringBuilder tabela = new StringBuilder();
        tabela.append(String.format("%-12s %-12s%n", "Celsius", "Fahrenheit"));
        tabela.append("-----------------------------\n");

        // Adiciona os valores à tabela
        for (int i = 0; i < tamanho; i++)
         {
            tabela.append(String.format("%-12.2f %-12.2f%n", celsius[i], fahrenheit[i]));
        }

        // Exibe a tabela em um diálogo
        JOptionPane.showMessageDialog(null, tabela.toString(), "Tabela de Conversão", JOptionPane.INFORMATION_MESSAGE);
    }
}



/*conta de conversão:
 F=(C×9/5)+32 */
