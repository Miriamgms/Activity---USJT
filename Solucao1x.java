//exercicio 18 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;
  public class Solucao1x
{
  public static void main(String[] args)
  {
      //apresentando medidas
       String sDiagonal1 = JOptionPane.showInputDialog(
         "Informe a diagonal maior do losango em metros:");
        String sDiagonal2 = JOptionPane.showInputDialog(
          "Informe a diagonal menor do losango em metros:");
            //convertendo para -real-
      double diagonal1 = Double.parseDouble(sDiagonal1);
      double diagonal2 = Double.parseDouble(sDiagonal2);
          //cálculo
       double area = (diagonal1 * diagonal2) / 2;
       //exibindo o resultado
   JOptionPane.showMessageDialog(null, "A área do losango é = " + area);
   }
}
