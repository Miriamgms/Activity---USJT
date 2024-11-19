
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTextoSimples {
    private final JTextField txtTexto;
    private JButton btnMostrar, btnLimpar, btnSair;

    public TelaTextoSimples() {
        JFrame frame = new JFrame("Exemplo de funções de botões");

        // Painel de entrada de texto
        JPanel painelEntrada = new JPanel(new FlowLayout());
        JLabel lblTexto = new JLabel("Texto:");
        txtTexto = new JTextField(20);
        painelEntrada.add(lblTexto);
        painelEntrada.add(txtTexto);

        // Painel de botões
        JPanel painelBotoes = new JPanel(new FlowLayout());
        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");
        painelBotoes.add(btnMostrar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);

        // Adicionando eventos aos botões
        btnMostrar.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText();
                if (!texto.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, texto, "Texto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Campo de texto vazio!", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                txtTexto.setText("");
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Configurações do frame
        frame.setLayout(new BorderLayout());
        frame.add(painelEntrada, BorderLayout.NORTH);
        frame.add(painelBotoes, BorderLayout.SOUTH);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TelaTextoSimples();
    }
}
