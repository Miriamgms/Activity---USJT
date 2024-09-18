//exercicio 15 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;
 public class Solucao1u
  {
     public static void main(String[] args) 
     {
     
                 // Solicitar o dividendo
            String sDividendo = JOptionPane.showInputDialog("Digite o dividendo em número inteiro:");
            int dividendo = Integer.parseInt(sDividendo);
            
            // Solicitar o divisor
            String sDivisor = JOptionPane.showInputDialog("Digite o divisor em número inteiro:");
            int divisor = Integer.parseInt(sDivisor);
                        
            // Calcular o quociente e o resto
            int quociente = (dividendo / divisor);
            int resto = (dividendo % divisor);
            
            // Resultado
                    
            JOptionPane.showMessageDialog(null, "Apresentação" + dividendo + " " + quociente + " " + resto);
           }
         
         }  
