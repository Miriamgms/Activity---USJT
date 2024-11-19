
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaRelogio extends JFrame implements ActionListener {
    private Relogio relogio;
    private JLabel lblMostrador;
    private JButton btnTicTac, btnHora, btnMinuto;

    public TelaRelogio() {
        super("Relógio");

        relogio = new Relogio();

        setLayout(new FlowLayout());

        lblMostrador = new JLabel(relogio.mostra());
        lblMostrador.setFont(new Font("Arial", Font.ITALIC, 30));
        lblMostrador.setForeground(Color.BLACK);
        add(lblMostrador);

        btnTicTac = new JButton("TicTac");
        btnTicTac.setFont(new Font("Arial", Font.PLAIN, 20));
        btnTicTac.addActionListener(this);
        add(btnTicTac);

        btnHora = new JButton("Hora");
        btnHora.setFont(new Font("Arial", Font.PLAIN, 20));
        btnHora.addActionListener(this);
        add(btnHora);

        btnMinuto = new JButton("Minuto");
        btnMinuto.setFont(new Font("Arial", Font.PLAIN, 20));
        btnMinuto.addActionListener(this);
        add(btnMinuto);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTicTac) {
            relogio.ticTac();
        } else if (e.getSource() == btnHora) {
            String horaStr = JOptionPane.showInputDialog("Digite a hora (0-23):");
            try {
                int hora = Integer.parseInt(horaStr);
                if (hora >= 0 && hora <= 23) {
                    while (relogio.hora.getValor() != hora) {
                        relogio.hora.incrementa();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Hora inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnMinuto) {
            String minutoStr = JOptionPane.showInputDialog("Digite o minuto (0-59):");
            try {
                int minuto = Integer.parseInt(minutoStr);
                if (minuto >= 0 && minuto <= 59) {
                    while (relogio.minuto.getValor() != minuto) {
                        relogio.minuto.incrementa();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Minuto inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        lblMostrador.setText(relogio.mostra());
    }

}
