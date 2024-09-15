//exercicio aula 01 - '3A'
import javax.swing.JOptionPane;
    public class Solucao1c
  {
     public static void main(String[] args) 
     {
      //lendo números
     String dp1 = JOptionPane.showInputDialog("Digite um dia do ano:");
     String dp2 = JOptionPane.showInputDialog("Digite um mês do ano:");
     String dp3 = JOptionPane.showInputDialog("Digite o ano:");
     //transforme em data de barras
   JOptionPane.showMessageDialog(null, " Data = " + dp1 + "/" + dp2 + "/" + dp3);
      }
     }
