/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class SolucaoAula2_19
{
    public static void main(String[] args) 
    {
        // Ler os dois números
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");


        // Converter para int
        int primeiroNumero = Integer.parseInt(sNum1);
        int segundoNumero = Integer.parseInt(sNum2);

        // Verificar e imprimir em ordem crescente
        if (primeiroNumero > segundoNumero) 
        {
            JOptionPane.showMessageDialog(null, "Ordem decrescente: " + primeiroNumero + ", " + segundoNumero);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Ordem decrescente: " + segundoNumero + ", "  + primeiroNumero);
        }
    }
}
