//exercicio 17 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;
  public class Solucao1w
{
  public static void main(String[] args)
  {
      //apresentando medidas
       String sBase = JOptionPane.showInputDialog(
         "Informe a base do triângulo:");
        String sAltura = JOptionPane.showInputDialog(
          "Informe a altura do triângulo:");
            //convertendo para -real-
      double base = Double.parseDouble(sBase);
      double altura = Double.parseDouble(sAltura);
          //cálculo
       double area = (base * altura) / 2;
       //exibindo o resultado
   JOptionPane.showMessageDialog(null, "A área do triângulo é = " + area);
   }
}
