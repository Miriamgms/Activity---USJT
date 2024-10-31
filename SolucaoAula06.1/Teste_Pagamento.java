import javax.swing.JOptionPane;

public class Teste_Pagamento {
    public static void main(String[] args) {
        // Coletando informações para Pagamento
        String nomeDoPagador = JOptionPane.showInputDialog("Informe o nome do pagador:");
        String cpf = JOptionPane.showInputDialog("Informe o CPF do pagador:");
        double valoraserpago = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser pago:"));

        //Selecionando método de pagamento
        String escolha = JOptionPane.showInputDialog("Informe o método de pagamento:" + "\n Opção 1 Cartão de crédito" + " Opção 2 Cheque" + " Opção 3 boleto");

      //Declarando opções
      int metodoPagamento = Integer.parseInt(escolha);

      if (metodoPagamento == 1) {
        String numeroCartao = JOptionPane.showInputDialog("Informe o número do cartão de crédito:");
        CartaoDeCredito cartao = new CartaoDeCredito(nomeDoPagador, cpf, valoraserpago, numeroCartao);
        JOptionPane.showMessageDialog(null, "Pagamento com Cartão de Crédito registrado!\n" + "Nome: " + cartao.getNomeDoPagador() + "\nValor: " + cartao.getValoraserpago());
      }
      if (metodoPagamento == 2){
        String numeroDoCheque = JOptionPane.showInputDialog("Informe o número do cheque");
        Cheque cheque = new Cheque(nomeDoPagador, escolha, valoraserpago, numeroDoCheque);
        JOptionPane.showMessageDialog(null, "Pagamento com Cheque registrado!\n" + "Nome: " +  cheque.getNomeDoPagador() + "\nValor: " + cheque.getValoraserpago());
      }
     if (metodoPagamento == 3){
        String numeroDoBoleto = JOptionPane.showInputDialog("Informe o número do boleto:");
        int diaVenc = Integer.parseInt(JOptionPane.showInputDialog("\nDia do vencimento"));
        int mesVenc = Integer.parseInt(JOptionPane.showInputDialog("\nMês do vencimento"));
        int anoVenc = Integer.parseInt(JOptionPane.showInputDialog("\nAno do vencimento"));

        Boleto boleto = new Boleto(nomeDoPagador, escolha, valoraserpago, numeroDoBoleto, diaVenc, mesVenc, anoVenc);
        JOptionPane.showMessageDialog(null, "Pagamento com Boleto registrado!\n" + "Nome: " +  boleto.getNomeDoPagador() + "\nValor: " + boleto.getValoraserpago());

     }
        
    }
}
