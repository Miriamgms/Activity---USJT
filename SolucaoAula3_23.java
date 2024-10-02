/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_23 {
    public static void main(String[] args) {
        // Lê a quantidade de números pares a serem impressos
        String sQuantidade = JOptionPane.showInputDialog("Quantos números pares deseja imprimir a partir de 2?");
        int quantidade = Integer.parseInt(sQuantidade);

        StringBuilder pares = new StringBuilder("Números pares: ");

     
        for (int i = 1; i <= quantidade; i++) {
            pares.append(i * 2).append(", ");
        }

      
        if (pares.length() > 0) {
            pares.setLength(pares.length() - 2);
        }

        // Exibe os números pares
        JOptionPane.showMessageDialog(null, pares.toString());
    }
}
