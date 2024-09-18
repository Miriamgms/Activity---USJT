//exercicio 13 aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;

public class Solucao1s 
{
    public static void main(String[] args)
     {
        // Solicita a entrada dos números
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número");
        String sNum3 = JOptionPane.showInputDialog("Digite o terceiro número");

        // Converte as entradas para números reais
        double numero1 = Double.parseDouble(sNum1);
        double numero2 = Double.parseDouble(sNum2);
        double numero3 = Double.parseDouble(sNum3);
        
        // Calcula a expressão x = 2 * ((numero1 - numero3) / 8) - numero2 * 5
        double resultado = 2 * ((numero1 - numero3) / 8) - numero2 * 5;
        
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O resultado da expressão é: " + resultado);
    }
}
