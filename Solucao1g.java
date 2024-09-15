//exercicio aula 01 - 1g
import javax.swing.JOptionPane;
  public class Solucao1g
{
  public static void main(String[] args)
  {
      //apresentar idade - P-D-U
       String sIdade = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt (sIdade);
String sDias = JOptionPane.showInputDialog("Digite quantos dias tem no ano:");
        int dias = Integer.parseInt (sDias);
            //inteiro calcular
        int diasVividos = idade * dias;
          //exibição
   JOptionPane.showMessageDialog(null, "você viveu aproximadamente " + diasVividos +  “dias.”);
   }
}

//Anotações: integer.parseInt =  converter uma string em um número inteiro Int = número inteiro
