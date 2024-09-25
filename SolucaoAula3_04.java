<<<<<<< HEAD
public class SolucaoAula3_04 {
    
}import javax.swing.JOptionPane;
        int contagem = 0; // contador para os números entre 100 e 200
        int numero; // variável para armazenar o número digitado

        do {
            // Lê um número usando JOptionPane
            String entrada = JOptionPane.showInputDialog("Digite um número (0 para sair):");
            // Converte a entrada para inteiro
            numero = Integer.parseInt(entrada);

            // Verifica se o número está entre 100 e 200
            if (numero >= 100 && numero <= 200) {
                contagem++;
            }

        } while (numero != 0); // Continua até que o usuário digite 0

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Você digitou " + contagem + " números entre 100 e 200.");
    }
}

=======
import javax.swing.JOptionPane;

public class SolucaoAula3_04
{
    public static void main(String[] args)
     {
        int conta = 0; // contador para os números entre 100 e 200
        int numero; // variável para armazenar o número digitado

        do {
            // entrada do número
            String entrada = JOptionPane.showInputDialog("Digite um número (90 para encerrar):");
            // Converte a entrada para inteiro
            numero = Integer.parseInt(entrada);

            // Verifica se o número está entre 100 e 200 com if
            if (numero >= 100 && numero <= 200) 
            {
                conta++;
            }

        } while (numero != 90); // Loop até que o úsuario digite o número 90

        // resultado
        JOptionPane.showMessageDialog(null, "Você digitou " + conta + " números entre 100 e 200.");
    }
}
>>>>>>> 027fe97cbc128315bbd3ec0a494718c857a3de42
