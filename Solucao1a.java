//exercicio aula 01 - '1A'
import javax.swing.JOptionPane;
    public class Solucao1a
  {
     public static void main(String[] args) 
     {
      //lendo três palavras
     String p1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
     String p2 = JOptionPane.showInputDialog("Digite a segunda palavra:");
     String p3 = JOptionPane.showInputDialog("Digite a terceira palavra:");
     //mudar ordem das palavras
   JOptionPane.showMessageDialog(null,"Palavras = " + p3 + " " + p2 + " " + p1);
      }
     }
