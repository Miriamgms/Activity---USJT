/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_03 
{
    public static void main(String[] args) {
       int soma = 0;
       int quantidadeDeNumeros = 5;
       for ( int i = 1; i <= quantidadeDeNumeros; i++) 
       {
         String palavra = JOptionPane.showInputDialog("Digite um número");
         int numero = Integer.parseInt(palavra);
         soma += numero;
       }
         int media = soma/quantidadeDeNumeros;
        JOptionPane.showMessageDialog(null, "A média dos números apresentados: " + media);
    
    }
}
