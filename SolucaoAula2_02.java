/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;
public class SolucaoAula2_02
{ 
    public static void main(String[] args) 
  {
    //lendo dois números
  String sValor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
  String sValor2 = JOptionPane.showInputDialog("Digite o segundo número:");

        // Convertendo para int
        int numero1 = Integer.parseInt(sValor1);
        int numero2 = Integer.parseInt(sValor2);

        // adição
        int soma = numero1 + numero2;

        // Utilizar if e else para verificar se a soma é menor ou igual a 20
        if (soma <= 20) 
        {
             // Subtrai 5 da soma 
                  soma -= 5; 
        }

        // Resultado apresentado subtraindo-se 5.
        JOptionPane.showMessageDialog(null, "O resultado é: " + soma);
    }
}
