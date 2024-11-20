

import javax.swing.*;
import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void inserirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(int id) {
        Cliente clienteARemover = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clienteARemover = cliente;
                break;
            }
        }
        if (clienteARemover != null) {
            clientes.remove(clienteARemover);
            JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    public void alterarCliente(int id, String nome, String fone) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.setNome(nome);
                cliente.setFone(fone);
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
    }

    public Cliente listarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public void listarTodosClientes() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente registrado.");
        } else {
            StringBuilder lista = new StringBuilder();
            for (Cliente cliente : clientes) {
                lista.append(cliente.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }
}
