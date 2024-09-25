/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_05 {
    public static void main(String[] args) {
        String sNome;
        while (true) { 
            sNome = JOptionPane.showInputDialog("Digite um nome:" + "FIM para encerrar.");
            //verificação em if
            if ( sNome.equals("FIM")){
                break;
            }
            JOptionPane.showMessageDialog(null, "Nomes digitados:" + sNome);
            
        }
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
 // Equals sistema de comparação
