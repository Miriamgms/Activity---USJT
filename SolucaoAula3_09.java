import javax.swing.JOptionPane;

public class SolucaoAula3_09
 {
    public static void main(String[] args) 
    {
        int soma = 0;
        int count = 1;
        StringBuilder output = new StringBuilder();

        while (count <= 100) 
        {
            for (int i = 0; i < 25; i++) 
            {
                if (count > 100) break; // Para evitar sair do limite
                output.append(count);
                soma += count;
                count++;
                if (i < 24) output.append(" - ");
            }
            output.append("\n"); // Nova linha após cada 25 números
        }

        output.append("Soma: ").append(soma);
        JOptionPane.showMessageDialog(null, output.toString(), "Números e Soma", JOptionPane.INFORMATION_MESSAGE);
    }
}
