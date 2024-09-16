//exercicio aula 01 - 10
import javax.swing.JOptionPane;
  public class Solucao1j
{
  public static void main(String[] args)
  {
     //lendo as três palavras
     String str1 = JOptionPane.showInputDialog(“Digite a primeira palavra:”);
     String str2 = JOptionPane.showInputDialog(“Digite a segunda palavra:”);
     String str3 = JOptionPane.showInputDialog(“Digite a terceira palavra:”);
    //somando os comprimentos das strings
    int comprimentoT = str1.length() + str2.length() + str3.length();
   //exibindo resultado
      JOptionPane.showMessageDialog(null, “O comprimento total das strings é:” + comprimentoTotal);
   }
}

//anotações:length : A propriedade length em Java é utilizada para retornar a quantidade de caracteres de uma string ou o tamanho de um array1234. 
//Caso a string ou o array esteja vazio, é retornado o valor 012. Por exemplo, a String "JAVA" tem length 4, que é o número de caracteres (letras) dentro da String3.

//anotações:Array: Os arrays tem por finalidade armazenar vários dados do mesmo tipo juntos como se tivéssemos vários elementos dentro de uma única variável. 
//Por exemplo um array de nomes (String) só pode conter apenas nomes pois são do mesmo tipo, da mesma forma se fizermos 
//um array que contém apenas dados numéricos não podemos colocar nele caracteres.
