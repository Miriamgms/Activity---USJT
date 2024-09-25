/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class SolucaoAula2_14
{
    public static void main(String[] args) 
    {
        // Ler um número inteiro de 4 casas
        String sNum4 = JOptionPane.showInputDialog("Digite um número inteiro de 4 casas:");
        int num4 = Integer.parseInt(sNum4);
        // Verificar se o sNum4 é válido
        
        if (num4 >= 1000 && num4 <= 9999)
        {
        
            // Extrair algarismos da unidade de milhar e da centena
            int iMilhar = Character.getNumericValue(sNum4.charAt(0));
            int iCentena = Character.getNumericValue(sNum4.charAt(1));
          
            // Formando o número
            int conjunto = iMilhar * 10 + iCentena;
            
            // Verificar se é múltiplo de 4
            if (conjunto % 4 == 0) 
            {
                JOptionPane.showMessageDialog(null, conjunto + " é múltiplo de 4.");
            }
             else
             {
                JOptionPane.showMessageDialog(null, conjunto + " não é múltiplo de 4.");
             }
             }
         }
      }
