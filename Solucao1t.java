//exercicio 14 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;
  public class Solucao1t
  {
     public static void main(String[] args) 
     {

       // Informar valor do raio
            String sRaio = JOptionPane.showInputDialog("Digite o valor do raio do círculo:");
            
            // Convertendo para double - real
            double raio = Double.parseDouble(sRaio);
            
            // Utilizando Math.PI
            double area = Math.PI * Math.pow(raio, 2);
            
           // Exibir
            JOptionPane.showMessageDialog(null, "A a área do círculo é" + " " + area);
          }
      }
 //Anotações: A constante Math.PI em Java é usada para representar o valor de π (pi)
