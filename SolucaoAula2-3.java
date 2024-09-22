/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

 public class Solucao3 
{
    public static void main(String[] args) 
    {
        String num = JOptionPane.showInputDialog("Digite um número:");
        double numero = Double.parseDouble(num);
        
        if (numero >= 0) 
        {
            double raizQuadrada = Math.sqrt(numero);
            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é " + raizQuadrada);
        } 
        else 
        {
            double quadrado = numero * numero;
            JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é " + quadrado);
        }
    }
}
