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

