/*Aula: 03
Estruturas de Repetição: laços while, do-while e for
import javax.swing.JOptionPane;*/

import javax.swing.JOptionPane;

public class SolucaoAula3_01
{
    public static void main(String[] args)
        {
        StringBuilder numeros = new StringBuilder();

        // Loop para os números de 1 a 100
        for (int i = 1; i <= 100; i++) {
            numeros.append(i); // Adiciona o número

            // Adiciona um hífen após o número, exceto após o último número
            if (i < 100) {
                numeros.append(" - ");
            }

            // A cada 20 números, adiciona uma nova linha
            if (i % 20 == 0) {
                numeros.append("\n");
            }
        }

        // Exibe os números acumulados
        JOptionPane.showMessageDialog(null, numeros.toString(), "Números (1 a 100)", JOptionPane.INFORMATION_MESSAGE);
    }
}


/*StringBuilder é uma classe em Java que permite criar e manipular sequências de caracteres de maneira eficiente. 
Ao contrário da classe String, que é imutável (ou seja, não pode ser alterada após ser criada), o StringBuilder pode ser modificado. 
Isso significa que você pode adicionar, remover e alterar caracteres sem criar novas instâncias a cada modificação, 
o que pode ser mais eficiente em termos de desempenho, especialmente em loops ou quando você precisa construir strings dinamicamente.*/
