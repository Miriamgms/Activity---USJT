import javax.swing.JOptionPane;

public class Termostato {
    private double temperatura;

    // Construtor
    public Termostato() {
        this.temperatura = 20.0;
    }

    // Método de acesso
    public double getTemperatura() {
        return temperatura;
    }

    // Método modificador
    public void setTemperatura(double temperatura) {
        if (temperatura >= 15.0 && temperatura <= 28.0) {
            this.temperatura = temperatura;
            JOptionPane.showMessageDialog(null, "Temperatura ajustada para: " + temperatura + " graus.", "Ajuste de Temperatura", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Temperatura deve estar entre 15 e 28 graus.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void aumentarTemperatura() {
        if (temperatura < 28.0) {
            temperatura++;
            JOptionPane.showMessageDialog(null, "Temperatura aumentada para: " + temperatura + " graus.", "Aumento de Temperatura", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void reduzirTemperatura() {
        if (temperatura > 15.0) {
            temperatura--;
            JOptionPane.showMessageDialog(null, "Temperatura reduzida para: " + temperatura + " graus.", "Redução de Temperatura", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
