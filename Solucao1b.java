/*exercicio 2 Aula: 01
Estrutura básica de um programa Java, Entrada e Saída, Variáveis, Atribuição,
Conversão de Strings*/
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


