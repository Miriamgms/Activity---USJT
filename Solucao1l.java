//exercicio aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings'12'
import javax.swing.JOptionPane;
  public class Solucao1l
{
     public static void main(String[] args) 
     {
              // Ler o número inteiro de 3 casas decimais usando JOptionPane
     String input = JOptionPane.showInputDialog
("Digite um número inteiro de 3 casas decimais (ex: 123):");
            // Converter a entrada para um inteiro
    int numero = Integer.parseInt(input);
          // Validar se o número tem exatamente 3 dígitos
                if (numero < 100 || numero > 999) {
       JOptionPane.showMessageDialog(null, "Por favor, digite um número inteiro de 3 casas decimais.");
return;
}
          // Extrair o algarismo da casa das dezenas
                int dezenas = (numero / 10) % 10;
           // Exibir o algarismo da casa das dezenas
       JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é " + dezenas);
      }
}
