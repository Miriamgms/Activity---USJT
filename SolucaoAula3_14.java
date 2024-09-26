/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_14
{
    public static void main(String[] args) 
  {
        //declarando
        int numero;
        int quantidadePrimos = 0;

        while (true) 
        {
            // Solicitar ao usuário que insira um número
            String entrada = JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para sair):");
            numero = Integer.parseInt(entrada);

            // if para verificar condição
            if (numero <= 0) 
            {
                break; // Saindo do laço se o número não for positivo
            }

            // Verificar se o número é primo
            boolean primo = primo(numero);
            if (primo) 
            {
                quantidadePrimos++;
            }
        }

        // Exibir quantos números primos entraram
        JOptionPane.showMessageDialog(null, "Quantidade de números primos: " + quantidadePrimos);
    }

    // Verificar se um número é primo
    public static boolean primo(int numero) 
  {
        boolean primo = true; // Assume que é primo
        if (numero <= 1) {
            primo = false; // Não é primo se menor ou igual a 1
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false; // Não é primo se divisível
                    break; // Para o laço
                }
            }
        }
        return primo; 
    }
}
