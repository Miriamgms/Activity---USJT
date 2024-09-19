//exercicio 12 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;

public class Solucao1r
{
    public static void main(String[] args)
     {
        // Data no formato dd/mm/aa
        String sData = JOptionPane.showInputDialog("Digite a data no formato dd/mm/aa:");

        // Separando a data usando o caractere '/'
        String[] part = sData.split("/");

        // Extraindo o dia/ o mês/ e o ano
        String dia = part[0];
        String mes = part[1];
        String ano = part[2];

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Dia: " + dia + " " + "Mês: " + mes + " " + "Ano: " + ano);
    }
}

/*anotações:
O método split("/") é usado para dividir a string em um array com três partes (dia, mês e ano).*/
