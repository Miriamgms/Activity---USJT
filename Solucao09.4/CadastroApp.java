
import javax.swing.*;

public class CadastroApp {
    public static void main(String[] args) {
        BancoDeClientes bancoDeClientes = new BancoDeClientes();
        int opcao = 0;

        while (opcao != 6) {
            StringBuilder menu = new StringBuilder();
            menu.append("Escolha uma opção:\n")
                    .append("1) Inserir cliente\n")
                    .append("2) Remover cliente\n")
                    .append("3) Alterar cliente\n")
                    .append("4) Listar dados de um cliente\n")
                    .append("5) Listar todos os clientes\n")
                    .append("6) Sair\n");

            try {
                String input = JOptionPane.showInputDialog(menu.toString());
                if (input == null) {
                    JOptionPane.showMessageDialog(null, "Operação cancelada. Saindo...");
                    break;
                }
                opcao = Integer.parseInt(input);

                if (opcao == 1) {
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    String fone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente:"));
                    Cliente novoCliente = new Cliente(nome, fone, id);
                    bancoDeClientes.inserirCliente(novoCliente);
                    JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
                } else if (opcao == 2) {
                    int idRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente a ser removido:"));
                    bancoDeClientes.removerCliente(idRemover);
                } else if (opcao == 3) {
                    int idAlterar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente a ser alterado:"));
                    String novoNome = JOptionPane.showInputDialog("Digite o novo nome do cliente:");
                    String novoFone = JOptionPane.showInputDialog("Digite o novo telefone do cliente:");
                    bancoDeClientes.alterarCliente(idAlterar, novoNome, novoFone);
                } else if (opcao == 4) {
                    int idListar = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do cliente para listar:"));
                    Cliente cliente = bancoDeClientes.listarCliente(idListar);
                    if (cliente != null) {
                        JOptionPane.showMessageDialog(null, cliente.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    }
                } else if (opcao == 5) {
                    bancoDeClientes.listarTodosClientes();
                } else if (opcao == 6) {
                    JOptionPane.showMessageDialog(null, "Saindo...");
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
