//exercicio 6 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;
  public class Solucao1l
{
     public static void main(String[] args) 
     {
              // Ler o número inteiro de 3 casas decimais 
     String input = JOptionPane.showInputDialog
("Digite um número inteiro de 3 casas decimais (ex: 123):");
            // Converter a entrada para um inteiro
    int numero = Integer.parseInt(input);
          // confirmar casas decimais
                if (numero < 100 || numero > 999) {
       JOptionPane.showMessageDialog(null, "Por favor, digite um número inteiro de 3 casas decimais.");
return;
}
          //pegar dezena
                int dezenas = (numero / 10) % 10;
           // Apresentar
       JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas é " + dezenas);
      }
}
