/*exercicio 1 Aula: 01
Estrutura básica de um programa Java, Entrada e Saída, Variáveis, Atribuição,
Conversão de Strings*/

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
