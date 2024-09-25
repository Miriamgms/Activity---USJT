/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;
public class SolucaoAula2_01
{ 
    public static void main(String[] args) 
  {
    //lendo dois números
String sValor1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
String sValor2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
       // Convertendo para int
        int valor1 = Integer.parseInt(sValor1);
        int valor2 = Integer.parseInt(sValor2);
      // adição
        int soma = valor1 + valor2;
       // Utilizar if e else para verificar se a soma é maior que 10
        if (soma > 10) 
        {
            JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "A soma não é maior que 10.");
        }
    }
}
