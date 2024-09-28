/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;

public class SolucaoAula3_17
{
    public static void main(String[] args) 
    {
        // Inicializa um array para armazenar os valores de conversão
        double[] polegadas = new double[20];
        double[] centimetros = new double[20];
        // Preenche os arrays com os valores de polegadas e suas conversões para centímetros
        for (int i = 0; i < 20; i++) 
        {
            polegadas[i] = i + 1; // Valores de 1 a 20
            centimetros[i] = polegadas[i] * 2.54; // Converte para centímetros
        }
        // Cria um StringBuilder para armazenar e montar a tabela
        StringBuilder tabela = new StringBuilder();
        tabela.append(String.format("%-12s %-12s%n", "Polegadas", "Centímetros"));
         //modelando a tabela com string format
        tabela.append("♥------------♥------------♥\n");
        // ----- adicona uma linha separadora à tabela

        // Adiciona os valores à tabela
        for (int i = 0; i < 20; i++)
        {
            tabela.append(String.format("%-12.2f %-12.2f%n", polegadas[i], centimetros[i]));
        }

         // Define a cor de fundo do JOptionPane usando valores RGB para rosa claro
        UIManager.put("Panel.background", new Color(237, 160, 222)); // Rosa claro
        UIManager.put("OptionPane.background", new Color(237, 160, 222));
        UIManager.put("Button.background", Color.LIGHT_GRAY); // Cor dos botões

        // Exibe a tabela em um diálogo
        JOptionPane.showMessageDialog(null, tabela.toString(), "Tabela de Conversão", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
