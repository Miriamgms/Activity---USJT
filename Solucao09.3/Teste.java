
import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();

        while (true) {
            String opcoes =
                    "Escolha uma opção:\n" +
                            "1. Adicionar caixa\n" +
                            "2. Remover caixa\n" +
                            "3. Procurar caixa\n" +
                            "4. Alterar caixa\n" +
                            "5. Listar caixas mais pesadas que (Valor Digitado)\n" +
                            "6. Sair";

            String escolha = JOptionPane.showInputDialog(opcoes);

            if (escolha == null) continue;

            if (escolha.equals("1")) {
                String corredor = JOptionPane.showInputDialog("Digite o corredor: ");
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição: "));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da caixa:"));
                String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa:");
                deposito.adicionarCaixa(new Caixa(corredor, posicao, peso, dono));
            } else if (escolha.equals("2")) {
                String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa que deseja remover:");
                deposito.removerCaixa(dono);
            } else if (escolha.equals("3")) {
                String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa que deseja procurar:");
                deposito.mostrarCaixasPorDono(dono);
            } else if (escolha.equals("4")) {
                String dono = JOptionPane.showInputDialog("Digite o nome do dono da caixa que deseja atualizar:");
                String corredor = JOptionPane.showInputDialog("Digite o corredor da nova caixa: ");
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da nova caixa: "));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nova caixa: "));
                deposito.atualizarCaixa(new Caixa(corredor, posicao, peso, dono));
            } else if (escolha.equals("5")) {
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso que deseja filtrar:"));
                deposito.caixasPorPeso(peso);
            } else if (escolha.equals("6")) {
                JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }
}
