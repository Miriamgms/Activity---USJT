import javax.swing.JOptionPane;

public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    // Construtor
    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false; 
    }

    // Método para ligar o ar condicionado
    public void ligar() {
        ligado = true;
        JOptionPane.showMessageDialog(null, "Condicionador ligado.", "Estado", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método modificador para ajustar a temperatura
    public void setTermostato(double temperatura) {
        if (ligado) {
            termostato.setTemperatura(temperatura);
        } else {
            JOptionPane.showMessageDialog(null, "Condicionador desligado. Não é possível ajustar a temperatura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método exibir a temperatura
    public void imprimirTemperatura() {
        if (ligado) {
            JOptionPane.showMessageDialog(null, "Temperatura atual: " + termostato.getTemperatura() + " graus.", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Condicionador desligado. Não é possível imprimir a temperatura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
