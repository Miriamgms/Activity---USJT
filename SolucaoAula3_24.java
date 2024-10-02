import javax.swing.JOptionPane;

public class SolucaoAula3_24
{
    public static void main(String[] args) {
        double total = 0;
        double preco;
        int quantidade;

        while (true) {
            // Lê o preço da mercadoria
            preco = -1; // Inicializa com um valor negativo para entrar no loop
            while (preco < 0) {
                String sPreco = JOptionPane.showInputDialog("Digite o preço da mercadoria:");
                preco = Double.parseDouble(sPreco);
                if (preco < 0) {
                    JOptionPane.showMessageDialog(null, "Preço não pode ser negativo. Tente novamente.");
                }
            }

            // Lê a quantidade de itens comprados
            quantidade = -1; // Inicializa com um valor negativo para entrar no loop
            while (quantidade < 0) {
                String sQuantidade = JOptionPane.showInputDialog("Digite a quantidade de itens comprados (ou 0 para finalizar):");
                quantidade = Integer.parseInt(sQuantidade);
                if (quantidade < 0) {
                    JOptionPane.showMessageDialog(null, "Quantidade não pode ser negativa. Tente novamente.");
                }
            }

            // Verifica se a quantidade é zero para encerrar
            if (quantidade == 0) {
                break; // Sai do loop
            }

            // Calcula o total a ser pago
            total += preco * quantidade;
        }

        // Exibe o total a ser pago
        JOptionPane.showMessageDialog(null, "Total a ser pago: R$ " + total);
    }
}
