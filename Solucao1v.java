//exercicio 16 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;
  public class Solucao1v
{
  public static void main(String[] args)
  {
        // entrada do número
        String sNumero = JOptionPane.showInputDialog("Digite um número:");
        
        // Gerar número
        double numero = Double.parseDouble(sNumero);
        
        // Gerar ao quadrado do número
        double quadrado = Math.pow(numero, 2);
        
        //Gerar raiz quadrada do número
        double raizQuadrada = Math.sqrt(numero);
        
        // Exibe o número, seu quadrado e sua raiz quadrada
        String apresentação = String.format
        ( "Apresentação:" + numero + " " + quadrado + " " + raizQuadrada);
        
        JOptionPane.showMessageDialog(null, apresentação);
    }
}

/*anotações
- A função Math.sqrt é usada para calcular a raiz quadrada de um número. É uma função da classe Math.
- A função String.format é usada para criar strings formatadas com um formato específico. É uma maneira poderosa e flexível de 
construir strings que incluem variáveis, números, datas e outros valores de forma legível e controlada. */

