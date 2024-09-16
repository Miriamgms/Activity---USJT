//exercicio aula 01 - 8
import javax.swing.JOptionPane;
  public class Solucao1h
{
  public static void main(String[] args)
  {
      //apresentando medidas
       String sBase = JOptionPane.showInputDialog(
         "Informe a base do retângulo:");
        String sAltura = JOptionPane.showInputDialog(
          "Informe a altura do retângulo:");
            //convertendo para -real-
      double base = Double.parseDouble(sBase);
      double altura = Double.parseDouble(sAltura);
          //cálculo
       double area = (base * altura);
       //exibindo o resultado
   JOptionPane.showMessageDialog(null, "A área do retângulo é = " + area);
   }
}

//Anotações: import javax.swing.JoptionPane = importar “janela” de dialógo | JOptionPane.showInputDialog = apresentar “janela” | Double.parseDouble = converter uma string para um double 
//Double =  Ele é usado para armazenar valores numéricos com casas decimais
// JOptionPane.showMessageDialog = “janela de apresentação”

