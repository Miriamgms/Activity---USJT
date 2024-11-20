
import javax.swing.*;
import java.util.ArrayList;

public class BlocoDeNotas {

    private ArrayList<String> notas = new ArrayList<>();

    public void inserirNota(String nota) {
        notas.add(nota);
        JOptionPane.showMessageDialog(null, "Nota inserida com sucesso!");
    }

    public void removerNota(String nota) {
        if (notas.remove(nota)) {
            JOptionPane.showMessageDialog(null, "Nota removida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Nota não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizarNota(String notaAntiga, String notaNova) {
        boolean notaEncontrada = false;

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).equals(notaAntiga)) {
                notas.set(i, notaNova);
                notaEncontrada = true;
                JOptionPane.showMessageDialog(null, "Nota atualizada com sucesso!");
                break;
            }
        }

        if (!notaEncontrada) {
            JOptionPane.showMessageDialog(null, "Nota não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listarNotas() {
        if (notas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma nota cadastrada.");
        } else {
            JOptionPane.showMessageDialog(null, "Notas cadastradas:\n" + String.join("\n", notas));
        }
    }
}
