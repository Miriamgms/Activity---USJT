/*Aula: 03
Estruturas de Repetição: laços while, do-while e for
import javax.swing.JOptionPane;*/

public class SolucaoAula3_01
{
    public static void main(String[] args)
     {
        int i = 1;

        while (i <= 100) 
        {
            StringBuilder numeros = new StringBuilder();

            // Adiciona 50 números ao StringBuilder
            int count = 0;
            while (count < 50 && i <= 100) {
                numeros.append(i).append("\n");
                i++;
                count++;
            }

            // Exibe os números acumulados
            JOptionPane.showMessageDialog(null, numeros.toString(), "Números", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

/*StringBuilder é uma classe em Java que permite criar e manipular sequências de caracteres de maneira eficiente. 
Ao contrário da classe String, que é imutável (ou seja, não pode ser alterada após ser criada), o StringBuilder pode ser modificado. 
Isso significa que você pode adicionar, remover e alterar caracteres sem criar novas instâncias a cada modificação, 
o que pode ser mais eficiente em termos de desempenho, especialmente em loops ou quando você precisa construir strings dinamicamente.*/
