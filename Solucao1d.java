/*exercicio 4 Aula: 01
Estrutura básica de um programa Java, Entrada e Saída, Variáveis, Atribuição,
Conversão de Strings*/
import javax.swing.JOptionPane;
    public class Solucao1d
  {
     public static void main(String[] args) 
     {
      //Apresentando valor
     String speso = JOptionPane.showInputDialog("Digite seu peso em formato real:");
     //transforme em kg
   JOptionPane.showMessageDialog(null, "Resultado = " + speso + "kg");
      }
     }
