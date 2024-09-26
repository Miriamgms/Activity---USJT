/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_11 
{
    public static void main(String[] args) 
    {
        int codigo;
        double consumo, custo;
        double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
        double mediaResidencial = 0, mediaComercial = 0;
        int contadorResidencial = 0, contadorComercial = 0;

        while (true) 
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do consumidor (0 para sair):"));
            if (codigo == 0) break;

            consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:"));
            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1 - residencial, 2 - comercial, 3 - industrial):"));

            switch (tipo) {
                case 1:
                    custo = consumo * 0.3;
                    totalResidencial += consumo;
                    mediaResidencial += consumo;
                    contadorResidencial++;
                    break;
                case 2:
                    custo = consumo * 0.5;
                    totalComercial += consumo;
                    mediaComercial += consumo;
                    contadorComercial++;
                    break;
                case 3:
                    custo = consumo * 0.7;
                    totalIndustrial += consumo;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo inválido!");
                    continue;
            }

            JOptionPane.showMessageDialog(null, "Custo total para o consumidor " + codigo + ": R$ " + custo);
        }

        double totalGeral = totalResidencial + totalComercial + totalIndustrial;
        double mediaFinalResidencial = (contadorResidencial > 0) ? mediaResidencial / contadorResidencial : 0;
        double mediaFinalComercial = (contadorComercial > 0) ? mediaComercial / contadorComercial : 0;

        String resultado = "Total de consumo Residencial: " + totalResidencial + " kWh\n" +
                           "Total de consumo Comercial: " + totalComercial + " kWh\n" +
                           "Total de consumo Industrial: " + totalIndustrial + " kWh\n" +
                           "Média de consumo Residencial: " + mediaFinalResidencial + " kWh\n" +
                           "Média de consumo Comercial: " + mediaFinalComercial + " kWh\n" +
                           "Total Geral de consumo: " + totalGeral + " kWh";
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
