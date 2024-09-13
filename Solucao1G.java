//exercicio aula 01 - 1g
import javax.swing.JOptionPane;
  public class Solucao1G
{
  public static void main(String[] args)
  {
      //apresentar idade - P-D-U
       String sIdade = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = integer.parseInt (sIdade);
            //inteiro calcular
        int diasVividos = idade * 365;
          //exibição
   JOptionPane.showMessageDialog(null, "você viveu aproximadamente " + diasVividos +  “dias.”);
   }
}

//Anotações: integer.parseInt =  converter uma string em um número inteiro Int = número inteiro
