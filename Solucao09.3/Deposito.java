
import javax.swing.*;
import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas = new ArrayList<>();

    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
        JOptionPane.showMessageDialog(null, "Caixa adicionada com sucesso!", "Caixa", JOptionPane.INFORMATION_MESSAGE);
    }

    public void removerCaixa(String dono) {
        boolean encontrou = false;
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                caixas.remove(i);
                encontrou = true;
                JOptionPane.showMessageDialog(null, "Caixa removida com sucesso!", "Caixa", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        if (!encontrou) {
            JOptionPane.showMessageDialog(null, "Caixa não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Caixa> buscarPorDono(String dono) {
        ArrayList<Caixa> caixasEncontradas = new ArrayList<>();
        for (Caixa caixa : caixas) {
            if (caixa.getDono().equals(dono)) {
                caixasEncontradas.add(caixa);
            }
        }
        return caixasEncontradas;
    }

    public void mostrarCaixasPorDono(String dono) {
        ArrayList<Caixa> caixasEncontradas = buscarPorDono(dono);

        if (caixasEncontradas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "-1", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            StringBuilder caixasInfo = new StringBuilder();
            for (Caixa caixa : caixasEncontradas) {
                caixasInfo.append(caixa.getDados()).append("\n");
            }
            JOptionPane.showMessageDialog(null, caixasInfo, "Caixa(s) Encontrada(s)", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void atualizarCaixa(Caixa caixaNova) {
        boolean encontrou = false;
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(caixaNova.getDono())) {
                caixas.set(i, caixaNova);
                encontrou = true;
                JOptionPane.showMessageDialog(null, "Caixa atualizada com sucesso!", "Caixa", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        if (!encontrou) {
            JOptionPane.showMessageDialog(null, "Nenhuma caixa encontrada para o dono especificado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void caixasPorPeso(double peso) {
        ArrayList<Caixa> caixasPesadas = new ArrayList<>();
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > peso) {
                caixasPesadas.add(caixa);
            }
        }

        if (caixasPesadas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma caixa encontrada acima do peso especificado.", "Caixas", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder caixasInfo = new StringBuilder();
            for (Caixa caixa : caixasPesadas) {
                caixasInfo.append(caixa.getDados()).append("\n");
            }
            JOptionPane.showMessageDialog(null, caixasInfo, "Caixa(s) Pesada(s)", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
