import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args) {
        // Criando a agência
        Agencia agencia = new Agencia("Agência Central", 789, 5);

        // Criando a conta corrente
        ContaCorrenteDigito conta = new ContaCorrenteDigito(1234, agencia, 150.00);

        //informações do cliente adicionadas
        String nomeCliente = "Ademar Apior";
        String cpfCliente = "123231518-12";

      
        double saque1 = conta.sacar(140.0);
        if (saque1 > 0) {
            JOptionPane.showMessageDialog(null, "Saque de R$ 140.00 realizado com sucesso!", "Saque", JOptionPane.INFORMATION_MESSAGE);
        }

        //Consulta do saldo - 1
        double saldo1 = conta.consultarSaldo();
        JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + saldo1, "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);

   
        double saque2 = conta.sacar(200.0);
        if (saque2 == 0) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar sacar R$ 200.00. Saldo insuficiente.", "Saque", JOptionPane.ERROR_MESSAGE);
        }

        //Consultar saldo - 2
        double saldo2 = conta.consultarSaldo();
        JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + saldo2, "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);

        // Depósito
        conta.depositar(25.45);
        JOptionPane.showMessageDialog(null, "Depósito de R$ 25.45 realizado com sucesso!", "Depósito", JOptionPane.INFORMATION_MESSAGE);

        //Saldo
        conta.imprimirSaldo();
    }
}
