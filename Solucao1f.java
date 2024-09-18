/*exercicio 6 Aula: 01
Estrutura básica de um programa Java, Entrada e Saída, Variáveis, Atribuição,
Conversão de Strings*/

import javax.swing.JOptionPane;
public class Solucao1f
{
   public static void main (String[] aaaa)
   {
     // Definindo String
     String sUm = JOptionPane.showInputDialog 
     ("Digite o primeiro número em milhar");
     String sDois = JOptionPane.showInputDialog
     ("Digite o segundo número em centena");
     String sTres = JOptionPane.showInputDialog
     ("Digite o terceiro número dezena");
     String sQuatro = JOptionPane.showInputDialog
     ("Digite o quarto número unidade");
     
     //Utilizando o char
     char milhar = sUm.charAt (0);
     char centena = sDois.charAt (0);
     char dezena = sTres.charAt (0);
     char unidade = sQuatro.charAt (0);
     
     //Apresentando
     JOptionPane.showMessageDialog (null, "O valor do número digitado é: " + milhar + centena + dezena + unidade);
   }
}
