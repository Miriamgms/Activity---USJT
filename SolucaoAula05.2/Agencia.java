//Soluçao Aula 05 - PART. 2 (D)
import javax.swing.JOptionPane;

public class Agencia {
    // Atributos
    private String nome;
    private int numero;
    private int digito;

    // Método Construtor
    public Agencia(String nome, int numero, int digito) {
        this.nome = nome;
        setNumero(numero); 
        setDigito(digito);
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    // Métodos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        if (numero >= 100 && numero <= 999) { 
            this.numero = numero;
        } 
        else {
            JOptionPane.showMessageDialog(null, "Número da agência deve ter exatamente 3 dígitos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setDigito(int digito) {
        if (digito >= 0 && digito <= 9) { 
            this.digito = digito;
        } 
        else {
            JOptionPane.showMessageDialog(null, "Dígito da agência deve ser entre 0 e 9.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

  
    public String toString() {
        return nome + " (" + numero + "-" + digito + ")";
    }
}
