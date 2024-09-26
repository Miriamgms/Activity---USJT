import javax.swing.JOptionPane;

public class SolucaoAula3_15
{
    public static void main(String[] args) 
  {
        int maior = Integer.MIN_VALUE; // Inicializa o maior com o menor valor possível
        int numero;

        while (true) {
            // Solicita um número ao usuário
            String input = JOptionPane.showInputDialog("Digite um número (-9999 para sair):");
            
            // Verifica se o usuário cancelou a entrada
            if (input == null) {
                break;
            }

            // Converte a entrada para inteiro
            numero = Integer.parseInt(input);

            // Verifica se o usuário deseja sair
            if (numero == -9999) {
                break;
            }

            // Verifica se o número atual é maior que o maior encontrado
            if (numero > maior) {
                maior = numero;
            }
        }

        // Mostra o maior número encontrado
        if (maior != Integer.MIN_VALUE) {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número válido foi digitado.");
        }
    }
}
