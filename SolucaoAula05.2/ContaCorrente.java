//Soluçao Aula 05 - PART. 2 (B)
public class ContaCorrente{
//atributos
private int numero;
private int digito;
private Agencia agencia;
private double saldo;

//método construtor
public ContaCorrente(int numero, int digito, Agencia agencia, double saldo){
this.numero = numero;
this.digito = digito;
this.agencia = agencia;
this.saldo =  saldo;
 }

//métodos de acesso
 public int getNumero(){
        return numero;
    }
public int getDigito(){
        return digito;
    }
 public Agencia getAgencia(){
        return agencia;
    }
public double getSaldo(){
        return saldo;
    }

//métodos modificadores 
public void setNumero(int numero) {
        this.numero = numero;
    }
  public void setDigito(int digito) {
        this.digito = digito;
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
        }
    }
// Método sacar
    public double sacar(double valor) {
        if (valor > saldo) {
            return 0; // Não pode dar negativo o saldo
        } 
        else {
            saldo -= valor;
            return valor; // Saque realizado
        }
    }
  // Método consultarSaldo
    public double consultarSaldo() {
        return saldo;
    }
public void imprimirSaldo() {
    String mensagem = "Conta Corrente: " + numero + "-" + digito + 
                      "\nAgência: " + agencia.toString() + 
                      "\nSaldo: " + String.format("%.2f", saldo);
    JOptionPane.showMessageDialog(null, mensagem, "Saldo da Conta", JOptionPane.INFORMATION_MESSAGE);
}

}
