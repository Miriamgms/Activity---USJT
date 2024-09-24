/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

 public class SolucaoAula2_03 
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


/*anotações: a função Math.sqrt() em Java é usada para calcular a raiz quadrada de um número. Por exemplo, Math.sqrt(25) retornará 5.0, pois a raiz quadrada de 25 é 5.*/
