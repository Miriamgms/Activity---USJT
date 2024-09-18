//exercicio 9 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;
public class Solucao1o
{
   public static void main (String [] args)
   {
      String sNum = JOptionPane.showInputDialog
      ("Digite um número");
      String sBase = JOptionPane.showInputDialog
      ("Digite a base do logaritmo");
      
      int numero = Integer.parseInt(sNum);
      int base = Integer.parseInt(sBase);
      
      
      double resultado = Math.log(numero) / Math.log(base);
            
      JOptionPane.showMessageDialog (null, "O logaritmo deste número é: " + resultado);
   }
}
