/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class Solucao4 
{
    public static void main(String[] args) 
    {
        // Ler os dois números
        String sNum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNum2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String sNum3 = JOptionPane.showInputDialog("Digite o terceiro número:");

        // Converter para int
        int primeiroNumero = Integer.parseInt(sNum1);
        int segundoNumero = Integer.parseInt(sNum2);
        int terceiroNumero = Integer.parseInt(sNum3);

        // Verificar e imprimir em ordem crescente
        if (primeiroNumero < segundoNumero && segundoNumero < terceiroNumero) 
        {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + terceiroNumero + ", "  + segundoNumero + ", " + primeiroNumero);
        }
    }
}
