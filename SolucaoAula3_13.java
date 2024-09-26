/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_13
  {
    public static void main(String[] args) 
    {
        // Declarando
        int numero;
        String escrita;

        do {
            // Entrada de dados
            escrita = JOptionPane.showInputDialog("Digite um número inteiro (ou '0' para sair):");
            numero = Integer.parseInt(escrita);

            // Encerrar programa
            if (numero == 0) {
                break; // Saída do laço com 0
            }

            // If e else para verificar condição
            if (numero <= 1) {
                JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
            } else {
                boolean primo = true;
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false; // Não é primo
                        break; // Para o laço
                    }
                }

                if (primo) {
                    JOptionPane.showMessageDialog(null, numero + " é um número primo.");
                } else {
                    JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
                }
            }
        } while (true); // Condição para repetir indefinidamente
    }
}


          
