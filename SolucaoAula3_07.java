/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_07 
{
    public static void main(String[] args) 
    {
        StringBuilder multiplosde5 = new StringBuilder();
        for ( int i = 1; i <= 500; i++){
           if (i % 5 == 0){
            multiplosde5.append(i).append("\n");
           }
        }
        JOptionPane.showMessageDialog(null,  multiplosde5.toString(), "Números Múltiplos de 5 de 1 à 500:", JOptionPane.INFORMATION_MESSAGE);
    }
}
