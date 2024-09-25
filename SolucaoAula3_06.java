import javax.swing.JOptionPane;

public class SolucaoAula3_06 {

    public static void main(String[] args) {

        while (true) { 
            // Correção na leitura do número
            int numerosDigitados = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:" + "\n-999 para encerrar."));

            // Verificação em if
            if (numerosDigitados == -999) {
                break;
            }
            if (numerosDigitados >= 0) {
                double raizQuadrada = Math.sqrt(numerosDigitados);
                JOptionPane.showMessageDialog(null, "Raiz quadrada de " + numerosDigitados + " é: " + raizQuadrada);
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível calcular a raiz porque é um número negativo.");
            }
            if (numerosDigitados != 0) {
                double inverso = 1.0 / numerosDigitados;
                JOptionPane.showMessageDialog(null, "O inverso de " + numerosDigitados + " é: " + inverso);
            } else {
                JOptionPane.showMessageDialog(null, "Não existe inverso de 0");
            }
        }
        
        // Mensagem final após encerrar o loop
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}

    
