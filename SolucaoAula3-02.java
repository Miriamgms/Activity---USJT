/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class Solucao02 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
        if( i % 2 == 0){
            JOptionPane.showMessageDialog(null, i  );
        }
        i++;
        }
    }
}
