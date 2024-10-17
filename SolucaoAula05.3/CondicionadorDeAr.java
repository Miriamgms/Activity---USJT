import javax.swing.JOptionPane;

public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    // Construtor
    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false; 
    }

    // Métodos de acesso
    public boolean isLigado() {
        return ligado;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    // Método para ligar o ar condicionado
    public void ligar() {
        ligado = true;
        JOptionPane.showMessageDialog(null, "Condicionador ligado.", "Estado", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para desligar o ar condicionado
    public void desligar() {
        ligado = false;
        JOptionPane.showMessageDialog(null, "Condicionador desligado.", "Estado", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para aumentar a temperatura
    public void aumentarTemperatura() {
        if (ligado) {
            termostato.aumentarTemperatura();
            JOptionPane.showMessageDialog(null, "Temperatura aumentada. Temperatura atual: " + termostato.getTemperatura() + " graus.", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Condicionador desligado. Não é possível aumentar a temperatura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para reduzir a temperatura
    public void reduzirTemperatura() {
        if (ligado) {
            termostato.reduzirTemperatura();
            JOptionPane.showMessageDialog(null, "Temperatura reduzida. Temperatura atual: " + termostato.getTemperatura() + " graus.", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Condicionador desligado. Não é possível reduzir a temperatura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // exibindo temperatura 
    public void imprimirTemperatura() {
        if (ligado) {
            JOptionPane.showMessageDialog(null, "Temperatura atual: " + termostato.getTemperatura() + " graus.", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Condicionador desligado. Não é possível imprimir a temperatura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

