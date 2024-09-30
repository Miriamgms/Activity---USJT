import javax.swing.JOptionPane;

public class SolucaoAula3_20 
{
    public static void main(String[] args) 
    {
        // Lê o limite superior do intervalo
        String limiteStr = JOptionPane.showInputDialog("Digite o limite superior:");
        int limite = Integer.parseInt(limiteStr); // Converte a string para inteiro

        // Lê o incremento
        String incrementoStr = JOptionPane.showInputDialog("Digite o incremento:");
        int incremento = Integer.parseInt(incrementoStr); // Converte a string para inteiro

        // Variável para armazenar os números que serão impressos
        StringBuilder numeros = new StringBuilder();

        // Loop que começa em 0 e vai até o limite, com o incremento especificado
        for (int i = 0; i <= limite; i += incremento)
         {
            numeros.append(i).append(", "); // Adiciona o número atual à lista
        }

        // Remove a última vírgula e espaço, se houver
        if (numeros.length() > 0)
         {
            numeros.setLength(numeros.length() - 2); // Remove a vírgula e o espaço final
        }

        // Mostra os números em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Números do intervalo: " + numeros.toString());
    }
}
