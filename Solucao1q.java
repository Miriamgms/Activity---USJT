//exercicio 11 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings

import javax.swing.JOptionPane;

public class Solucao1q 
{
    public static void main(String[] args) 
    {
        // Solicitando a data em ddmmaa
        String sData = JOptionPane.showInputDialog("Digite a data no formato ddmmaa:");

        // Converte a string para número inteiro
        int dataNmr = Integer.parseInt(sData);

        // Extrai o dia, o mês e o ano
        int dia = dataNmr / 10000;            // Os dois primeiros dígitos
        int mes = (dataNmr / 100) % 100;      // O meio (dois dígitos)
        int ano = dataNmr % 100;              // Os últimos dois dígitos

        // Apresentação
        JOptionPane.showMessageDialog(null, "Dia: " + dia + " " + "Mês: " + mes + " " + "Ano: " + ano);
    }
}
