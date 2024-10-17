//Soluçao Aula 05 - PART. 2 (C)
import javax.swing.JOptionPane;

public class ContaCorrenteDigito {
    // Atributos
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    // Método construtor
    public ContaCorrenteDigito(int numero, Agencia agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        definirDigito();
    }

    // Método para definir o dígito
    private void definirDigito() {
        if (numero >= 1000 && numero <= 9999) {
            int primeiroDigito = numero / 1000; // Divide por 1000 para pegar o primeiro dígito
            int segundoDigito = (numero / 100) % 10; // Divide por 100 e pega o resto
            int terceiroDigito = (numero / 10) % 10; // Divide por 10 e pega o resto
            int quartoDigito = numero % 10; // Pega o último dígito

            // Multiplicação dos dígitos
            int soma = (primeiroDigito * 4) + (segundoDigito * 6) + (terceiroDigito * 8) + (quartoDigito * 2);

            // Cálculo do dígito
            digito = (soma % 11 == 10) ? 0 : soma % 11;
        } else {
            JOptionPane.showMessageDialog(null, "O número da conta deve ter exatamente 4 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Métodos de acesso
    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos modificadores
    public void setNumero(int numero) {
        if (numero >= 1000 && numero <= 9999) {
            this.numero = numero;
            definirDigito(); // Recalcular o dígito
        } else {
            JOptionPane.showMessageDialog(null, "Número deve ter exatamente 4 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor do depósito deve ser positivo.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método sacar
    public double sacar(double valor) {
        if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para o saque.", "Erro", JOptionPane.ERROR_MESSAGE);
            return 0; // Não pode dar negativo o saldo
        }
        saldo -= valor;
        return valor; // Saque realizado
    }

    // Método consultarSaldo
    public double consultarSaldo() {
        return saldo;
    }

    public void imprimirSaldo() {
        String mensagem = "Conta Corrente: " + numero + "-" + digito + 
                          "\nAgência: " + agencia.toString() + 
                          "\nSaldo: " + saldo; 
        JOptionPane.showMessageDialog(null, mensagem, "Saldo da Conta", JOptionPane.INFORMATION_MESSAGE);
    }
}
