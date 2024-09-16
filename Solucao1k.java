//exercicio Aula 01 - 11
import javax.swing.JOptionPane;
  public class Solucao1k
{
  public static void main(String[] args)
  {
      //apresentação e leitura de dados
       String sValorDoInicio = JOptionPane.showInputDialog(
         "Digite o valor inicial da sua dívida:");
        String sJuros = JOptionPane.showInputDialog(
          "Digite a taxa de juros (%):");
        String sMeses = JOptionPane.showInputDialog(
        “Digite o número de meses:”);
            //convertendo para real
      double valorDoInicio = Double.parseDouble(sValorDoInicio);
      double juros = Double.parseDouble(sJuros);
      Int meses = integer.parseInt(sMeses);
          //calculando
       double valorFinal = valorDoInicio * Mathpow(1 + juros / 100, meses);
       //apresentando o resultado
   JOptionPane.showMessageDialog(null, "O valor final da divida é = " + valorFinal);
   }
}
