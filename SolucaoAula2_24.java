/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/

import javax.swing.JOptionPane;

public class SolucaoAula2_24
{
    public static void main(String[] args) 
    {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) 
        {
            String snumeros = JOptionPane.showInputDialog("Digite o " + i + "º número:");
            int numero = Integer.parseInt(snumeros);

           //if maior
            if (numero > maior) 
            {
                maior = numero;
            }
          //if menor
            if (numero < menor) 
            {
                menor = numero;
            }}

        JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
      }
   }

//\n para pular a linha
/*Sobre o FOR: O loop permite que o programa solicite ao usuário que insira cinco números, um por vez. 
Após cada entrada, ele processa o número para verificar se é o maior ou o menor até aquele momento. 
Assim, o for é fundamental para repetir a solicitação de entrada e as comparações.*/
