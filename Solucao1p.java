//exercicio 10 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings

import javax.swing.JOptionPane;

public class Solucao1p 
{
    public static void main(String[] args)
     {
        // Leia as três frases
        String sFrase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
        String sFrase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
        String sFrase3 = JOptionPane.showInputDialog("Digite a terceira frase:");

        //Separando as frases
        String part1frase1 = sFrase1.substring(0, sFrase1.length() / 2);
        String part2frase1 = sFrase1.substring(sFrase1.length() / 2);
        
        String part1frase2 = sFrase2.substring(0, sFrase2.length() / 2);
        String part2frase2 = sFrase2.substring(sFrase2.length() / 2);
        
        String part1frase3 = sFrase3.substring(0, sFrase3.length() / 2);
        String part2frase3 = sFrase3.substring(sFrase3.length() / 2);        
        // Monta a frase embaralhada
        String fraseEmbaralhada =  part1frase2 + 
                                   part2frase3 + 
                                   part2frase2 + 
                                   part1frase1 + 
                                   part1frase3 + 
                                   part2frase1;

        // Concatena as frases originais
        String frasesConcatenadas = sFrase1 + " " + sFrase2 + " " + sFrase3;

        // Apresentar
        JOptionPane.showMessageDialog(null, "Frases Originais:" + frasesConcatenadas + "        " + "Frase Embaralhada:" + fraseEmbaralhada);
                                           
    }
}
