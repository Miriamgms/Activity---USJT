
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalculadora extends JFrame implements ActionListener {

    private JTextField txtDisplay;

    private int num1 = 0;
    private int num2 = 0;
    private String operador = "";
    private boolean novoNumero = true;

    public TelaCalculadora() {

        setTitle("Calculadora");
        setLayout(new BorderLayout());
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Display
        txtDisplay = new JTextField();
        txtDisplay.setFont(new Font("Arial", Font.PLAIN, 24));
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setEditable(false);
        add(txtDisplay, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 4, 10, 10)); // 4x4 grid para botões
        add(painelBotoes, BorderLayout.CENTER);

        // Botões numéricos e operadores
        JButton btn7 = new JButton("7");
        btn7.addActionListener(this);
        painelBotoes.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(this);
        painelBotoes.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(this);
        painelBotoes.add(btn9);

        JButton btnDividir = new JButton("/");
        btnDividir.addActionListener(this);
        painelBotoes.add(btnDividir);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(this);
        painelBotoes.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(this);
        painelBotoes.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(this);
        painelBotoes.add(btn6);

        JButton btnMultiplicar = new JButton("*");
        btnMultiplicar.addActionListener(this);
        painelBotoes.add(btnMultiplicar);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(this);
        painelBotoes.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(this);
        painelBotoes.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(this);
        painelBotoes.add(btn3);

        JButton btnSubtrair = new JButton("-");
        btnSubtrair.addActionListener(this);
        painelBotoes.add(btnSubtrair);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(this);
        painelBotoes.add(btn0);

        JButton btnC = new JButton("C");
        btnC.addActionListener(this);
        painelBotoes.add(btnC);

        JButton btnIgual = new JButton("=");
        btnIgual.addActionListener(this);
        painelBotoes.add(btnIgual);

        JButton btnSomar = new JButton("+");
        btnSomar.addActionListener(this);
        painelBotoes.add(btnSomar);

        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        System.out.println(comando);

        // Se o comando for um número
        if (comando.matches("[0-9]")) {
            if (novoNumero) {
                txtDisplay.setText(comando);
                novoNumero = false;
            } else {
                txtDisplay.setText(txtDisplay.getText() + comando);
            }
        }
        // Se o comando for 'C' (limpar)
        else if (comando.equals("C")) {

            txtDisplay.setText("");
            num1 = num2 = 0;
            operador = "";
            novoNumero = true;
        }
        // Se o comando for um operador
        else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
            if (!txtDisplay.getText().isEmpty()) {
                num1 = Integer.parseInt(txtDisplay.getText());
                operador = comando;
                txtDisplay.setText("");
                novoNumero = true;
            }
        }

        else if (comando.equals("=")) {
            if (!txtDisplay.getText().isEmpty()) {
                num2 = Integer.parseInt(txtDisplay.getText());
                int resultado = 0;

                // Realiza a conta com base no operador selecionado
                switch (operador) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            txtDisplay.setText("Erro");
                            return;
                        }
                        break;
                }
                txtDisplay.setText(String.valueOf(resultado));

                num1 = resultado;
                novoNumero = true;
            }
        }
    }

}
