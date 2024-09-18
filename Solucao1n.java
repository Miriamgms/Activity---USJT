//exercicio 8 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;
  public class Solucao1n
{
  public static void main(String[] args)
  {
      //digite o número
      String sNum = JOptionPane.showInputDialog
      ("Digite um número.");
      //convertendo
      double numero = Double.parseDouble (sNum);
      
      double resultado = Math.log10(numero);
      
      JOptionPane.showMessageDialog (null, "O logaritmo deste número é: " + resultado );
   }
}



/*o método Math.log() é utilizado para calcular o logaritmo natural ou logaritmo na base 
de um número.*/
