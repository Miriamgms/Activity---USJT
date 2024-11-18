
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPessoaFisica extends JFrame implements ActionListener {
    private JTextField txtNome, txtSobrenome, txtCpf, txtSeguro, txtSalario, txtComissao, txtVendas;
    private JComboBox<String> cboTipoPessoa;
    private JTextArea txtAreaDados;
    private JButton btnCriar, btnExibir;

    public TelaPessoaFisica() {
        super("Cadastro de Pessoas");
        setLayout(new GridLayout(10, 2, 5, 5));

        // Campos gerais
        add(new JLabel("Nome:"));
        txtNome = new JTextField();
        add(txtNome);

        add(new JLabel("Sobrenome:"));
        txtSobrenome = new JTextField();
        add(txtSobrenome);

        add(new JLabel("CPF:"));
        txtCpf = new JTextField();
        add(txtCpf);

        // Tipo de Pessoa
        add(new JLabel("Tipo de Pessoa:"));
        cboTipoPessoa = new JComboBox<>(new String[]{"Pessoa Física", "Desempregado", "Mensalista", "Vendedor"});
        cboTipoPessoa.addActionListener(this);
        add(cboTipoPessoa);

        // Campos específicos
        add(new JLabel("Seguro Desemprego:"));
        txtSeguro = new JTextField();
        add(txtSeguro);

        add(new JLabel("Salário Base:"));
        txtSalario = new JTextField();
        add(txtSalario);

        add(new JLabel("Comissão por Venda:"));
        txtComissao = new JTextField();
        add(txtComissao);

        add(new JLabel("Vendas Realizadas:"));
        txtVendas = new JTextField();
        add(txtVendas);

        // Botões
        btnCriar = new JButton("Criar Pessoa");
        btnCriar.addActionListener(this);
        add(btnCriar);

        btnExibir = new JButton("Exibir Dados");
        btnExibir.addActionListener(this);
        add(btnExibir);

        // Área de texto para exibir dados
        txtAreaDados = new JTextArea(5, 20);
        txtAreaDados.setEditable(false);
        add(new JScrollPane(txtAreaDados));

        // Configurações da janela
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        atualizarCamposEspecificos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cboTipoPessoa) {
            atualizarCamposEspecificos();
        } else if (e.getSource() == btnCriar) {
            String nome = txtNome.getText();
            String sobrenome = txtSobrenome.getText();
            String cpf = txtCpf.getText();
            PessoaFisica pessoa = null;

            try {
                switch ((String) cboTipoPessoa.getSelectedItem()) {
                    case "Pessoa Física":
                        pessoa = new PessoaFisica(nome, sobrenome, cpf);
                        break;
                    case "Desempregado":
                        double seguro = Double.parseDouble(txtSeguro.getText());
                        pessoa = new Desempregado(nome, sobrenome, cpf, seguro);
                        break;
                    case "Mensalista":
                        double salarioMensalista = Double.parseDouble(txtSalario.getText());
                        pessoa = new Mensalista(nome, sobrenome, cpf, salarioMensalista);
                        break;
                    case "Vendedor":
                        double salarioBase = Double.parseDouble(txtSalario.getText());
                        double comissao = Double.parseDouble(txtComissao.getText());
                        int vendas = Integer.parseInt(txtVendas.getText());
                        pessoa = new Vendedor(nome, sobrenome, cpf, salarioBase, comissao, vendas);
                        break;
                }

                if (pessoa != null) {
                    txtAreaDados.setText("Pessoa criada com sucesso!\n" + pessoa.dados());
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Erro: Verifique os valores inseridos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnExibir) {
            txtAreaDados.setText("Nome: " + txtNome.getText() +
                    "\nSobrenome: " + txtSobrenome.getText() +
                    "\nCPF: " + txtCpf.getText());
        }
    }

    private void atualizarCamposEspecificos() {
        String tipo = (String) cboTipoPessoa.getSelectedItem();

        txtSeguro.setEnabled("Desempregado".equals(tipo));
        txtSalario.setEnabled("Mensalista".equals(tipo) || "Vendedor".equals(tipo));
        txtComissao.setEnabled("Vendedor".equals(tipo));
        txtVendas.setEnabled("Vendedor".equals(tipo));
    }


}
