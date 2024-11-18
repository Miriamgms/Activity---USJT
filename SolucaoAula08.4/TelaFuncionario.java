
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFuncionario extends JFrame implements ActionListener {
    private JTextField txtNome, txtSobrenome, txtCpf, txtSalario, txtComissao, txtVendas, txtValorTarefa, txtTarefas;
    private JComboBox<String> cboTipo;
    private JTextArea areaTexto;
    private JButton btnCriar, btnExibir;

    public TelaFuncionario() {
        super("Cadastro de Funcionário");
        setLayout(new GridLayout(11, 2, 5, 5)); // Layout simples: 11 linhas, 2 colunas

        // Nome
        add(new JLabel("Nome:"));
        txtNome = new JTextField();
        add(txtNome);

        // Sobrenome
        add(new JLabel("Sobrenome:"));
        txtSobrenome = new JTextField();
        add(txtSobrenome);

        // CPF
        add(new JLabel("CPF:"));
        txtCpf = new JTextField();
        add(txtCpf);

        // Tipo
        add(new JLabel("Tipo:"));
        cboTipo = new JComboBox<>(new String[]{"Mensalista", "Vendedor", "Tarefeiro"});
        add(cboTipo);

        // Salário Base
        add(new JLabel("Salário Base:"));
        txtSalario = new JTextField();
        add(txtSalario);

        // Comissão
        add(new JLabel("Comissão por Venda:"));
        txtComissao = new JTextField();
        add(txtComissao);

        // Vendas
        add(new JLabel("Vendas:"));
        txtVendas = new JTextField();
        add(txtVendas);

        // Valor por Tarefa
        add(new JLabel("Valor por Tarefa:"));
        txtValorTarefa = new JTextField();
        add(txtValorTarefa);

        // Tarefas
        add(new JLabel("Tarefas Concluídas:"));
        txtTarefas = new JTextField();
        add(txtTarefas);

        // Botão Criar Funcionário
        btnCriar = new JButton("Criar Funcionário");
        btnCriar.addActionListener(this);
        add(btnCriar);

        // Botão Exibir Dados
        btnExibir = new JButton("Exibir Dados");
        btnExibir.addActionListener(this);
        add(btnExibir);

        // Área de Texto
        areaTexto = new JTextArea(5, 20);
        areaTexto.setEditable(false);
        add(new JScrollPane(areaTexto));

        // Configurações da Janela
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCriar) {
            String nome = txtNome.getText();
            String sobrenome = txtSobrenome.getText();
            String cpf = txtCpf.getText();
            double salario = Double.parseDouble(txtSalario.getText());

            Empregado funcionario = null;
            String tipo = (String) cboTipo.getSelectedItem();

            try {
                if (tipo.equals("Mensalista")) {
                    funcionario = new Mensalista(nome, sobrenome, cpf, salario);
                } else if (tipo.equals("Vendedor")) {
                    double comissao = Double.parseDouble(txtComissao.getText());
                    int vendas = Integer.parseInt(txtVendas.getText());
                    funcionario = new Vendedor(nome, sobrenome, cpf, salario, comissao, vendas);
                } else if (tipo.equals("Tarefeiro")) {
                    double valorTarefa = Double.parseDouble(txtValorTarefa.getText());
                    int tarefas = Integer.parseInt(txtTarefas.getText());
                    funcionario = new Tarefeiro(nome, sobrenome, cpf, valorTarefa, tarefas);
                }

                areaTexto.setText(funcionario.dados());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao criar funcionário! Verifique os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnExibir) {
            String nome = txtNome.getText();
            String sobrenome = txtSobrenome.getText();
            String cpf = txtCpf.getText();

            areaTexto.setText("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nCPF: " + cpf);
        }
    }

    public static void main(String[] args) {
        new TelaFuncionario();
    }
}
