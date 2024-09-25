import javax.swing.JOptionPane;

public class SolucaoAula3_10
{
    public static void main(String[] args) 
    {
        // declarando int
        int valor;

        while (true) 
        {
            String sValor = JOptionPane.showInputDialog("Digite um número (-999 para sair):");
            valor = Integer.parseInt(sValor);

            if (valor == -999) 
            {
                break;
                /*break é usada para interromper a execução de um laço ou de um bloco de código. 

              Encerrar um laço (for, while, ou do-while): Quando um determinado critério é atendido, você pode usar break para sair do laço imediatamente*/
            }

            StringBuilder divisores = new StringBuilder("Divisores de " + valor + ": ");
            for (int i = 1; i <= valor; i++) {
                if (valor % i == 0) {
                    divisores.append(i).append(" ");
                }
            }
            JOptionPane.showMessageDialog(null, divisores.toString());
        }
    }
}

