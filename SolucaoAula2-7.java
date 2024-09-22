/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao7
{
    public static void main(String[] args) 
    {
      String sNome = JOptionPane.showInputDialog("Digite seu nome:");
        char sexo = JOptionPane.showInputDialog("Digite seu sexo (F/M):").charAt(0);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        /* String para armazenar nome, char para armazenar o caractere do gênero e int para armazenar idade.*/
        if((sexo == 'F' || sexo == 'f') && (idade < 25))
        {
            JOptionPane.showMessageDialog(null, sNome + ", ACEITA.");
        } 
        else
        {
            JOptionPane.showMessageDialog(null, sNome + ", NÃO ACEITA.");
        }
    }
}


/* Parênteses da Condição IF: Adicionei parênteses ao redor da condição do if para garantir que a lógica seja avaliada corretamente.*/
