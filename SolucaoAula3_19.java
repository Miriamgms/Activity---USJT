/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class SolucaoAula3_19
 {
    public static void main(String[] args) 
    {
        String sEntrada = JOptionPane.showInputDialog("Digite um número para calcular o fatorial:");
        int numero = Integer.parseInt(sEntrada);
        BigInteger fatorial = BigInteger.ONE; // iniciando com 1

        if (numero < 0) 
        {
            JOptionPane.showMessageDialog(null, "O fatorial não está definido para números negativos.");
        } 
        else 
        {
            for (int i = 1; i <= numero; i++) 
            {
                fatorial = fatorial.multiply(BigInteger.valueOf(i)); // Multiplica pelo próximo número
            }
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
        }
    }
}

/*Importação: Importa BigInteger da biblioteca java.math
Vantagens do BigInteger:
Permite calcular fatoriais de números muito grandes, sem se preocupar com overflow.
BigInteger é uma classe em Java que permite manipular números inteiros de precisão arbitrária.*/
