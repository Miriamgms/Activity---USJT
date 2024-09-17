//exercicio aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings'10'
import javax.swing.JOptionPane;
  public class Solucao1j
{
  public static void main(String[] args)
  {
   //digitando string
        String sPalavra = JOptionPane.showInputDialog(null, "Digite a primeira string:");
        String sPalavr = JOptionPane.showInputDialog(null, "Digite a segunda string:");
        String sPalav = JOptionPane.showInputDialog(null, "Digite a terceira string:");

        // Calcula o comprimento de cada string
        int medida1 = sPalavra.length();
        int medida2 = sPalavr.length();
        int medida3 = sPalav.length();

        // Soma os comprimentos das três strings
        int comprimentos = medida1 + medida2 + medida3;

        // Exibe o resultado em um diálogo
        JOptionPane.showMessageDialog(null, "A soma dos comprimentos das strings é " + comprimentos);
    }
}

//anotações:length : A propriedade length em Java é utilizada para retornar a quantidade de caracteres de uma string ou o tamanho de um array1234. 
//Caso a string ou o array esteja vazio, é retornado o valor 012. Por exemplo, a String "JAVA" tem length 4, que é o número de caracteres (letras) dentro da String3.

//anotações:Array: Os arrays tem por finalidade armazenar vários dados do mesmo tipo juntos como se tivéssemos vários elementos dentro de uma única variável. 
//Por exemplo um array de nomes (String) só pode conter apenas nomes pois são do mesmo tipo, da mesma forma se fizermos 
//um array que contém apenas dados numéricos não podemos colocar nele caracteres.
