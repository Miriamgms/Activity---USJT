//exercicio ? aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings
import javax.swing.JOptionPane;

public class Solucao1N
{
    public static void main(String[] args) {
        // Solicitando número
        String input = JOptionPane.showInputDialog(null, "Digite um número:");

        // confirmar recebimento para prosseguir
        if (input != null && !input.trim().isEmpty()) {
            try {
                // Converte a entrada para double
                double numero = Double.parseDouble(input);

                // Verifica se o número é > que zero
                if (numero > 0) {
                    // Calcula o logaritmo na base 10
                    double logaritmoBase10 = Math.log10(numero);

                    // Exibe o resultado em uma caixa de diálogo
                    JOptionPane.showMessageDialog(null, String.format("Logaritmo na base 10 de %.2f é %.4f", numero, logaritmoBase10));
                } else {
                    // Exibe uma mensagem de erro se o número for menor ou igual a zero
                    JOptionPane.showMessageDialog(null, "O número deve ser maior que zero para calcular o logaritmo.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                // Exibe uma mensagem de erro se a entrada não for um número válido
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Exibe uma mensagem se a entrada estiver vazia
            JOptionPane.showMessageDialog(null, "Entrada não pode ser vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

//Se a conversão da entrada para double falhar (por exemplo, se a entrada não for um número válido)
//uma exceção NumberFormatException é capturada e uma mensagem de erro é exibida
