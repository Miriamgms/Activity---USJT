import javax.swing.JOptionPane;

public class Solucao15 
{
    public static void main(String[] args) 
    {
        String anoNascimento = JOptionPane.showInputDialog("Digite o ano do seu nascimento:");
        String anoAtual = JOptionPane.showInputDialog("Digite o ano atual:");

        // Converter em int
        int anoNsc = Integer.parseInt(anoNascimento);
        int anoAt = Integer.parseInt(anoAtual);

        // Confirmar se o ano é válido com if e else
        if (anoNsc >= 1700 && anoAt >= 1700) 
        {
            // Conta para calcular idade
            int conta = anoAt - anoNsc;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + conta);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Data inválida");
        }
    }
}
