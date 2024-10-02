import javax.swing.JOptionPane;

public class SolucaoAula3_26
  {
    public static void main(String[] args) 
    {
        // Lê dois números reais
        String sNumero1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sNumero2 = JOptionPane.showInputDialog("Digite o segundo número:");

        double numero1 = Double.parseDouble(sNumero1);
        double numero2 = Double.parseDouble(sNumero2);

        int opcao = 0;

        // Loop para apresentar o menu
        while (opcao != 9) {
            // Apresenta o menu
            String menu = "Operações Disponíveis:\n" +
                          "1. Adição\n" +
                          "2. Subtração\n" +
                          "3. Multiplicação\n" +
                          "4. Divisão\n" +
                          "9. Sair do Programa\n" +
                          "Digite a opção desejada:";
            String sOpcao = JOptionPane.showInputDialog(menu);
            opcao = Integer.parseInt(sOpcao);

            // Realiza a operação de acordo com a opção escolhida
            if (opcao == 1) {
                double resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "Resultado da Adição: " + resultado);
            } else if (opcao == 2) {
                double resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "Resultado da Subtração: " + resultado);
            } else if (opcao == 3) {
                double resultado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " + resultado);
            } else if (opcao == 4) {
                if (numero2 != 0) {
                    double resultado = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
                }
            } else if (opcao == 9) {
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}
