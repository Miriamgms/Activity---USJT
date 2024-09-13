//exercicio aula 01 - '2A'
import javax.swing.JOptionPane;
  public class Solucao1b
 {
   public static void main(String[] args) 
     {
     //colocando número inteiro
     String sInteiro = JOptionPane.showInputDialog
       ("Digite um número inteiro (ex: 123):");
        // Guardar e exibir valor
       int inteiro = Integer.parseInt(sInteiro);
           JOptionPane.showMessageDialog(null,"Numero = " + sInteiro);
         }
        } 


