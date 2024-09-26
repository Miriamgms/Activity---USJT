/*Aula: 03
Estruturas de Repetição: laços while, do-while e for*/
import javax.swing.JOptionPane;

public class SolucaoAula3_12
{
    public static void main(String[] args) 
    {
    //declarando int
        int idade;
        int totalMenor21 = 0;
        int totalMaior50 = 0;

        while (true) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade entre 1-120 Anos (digite uma idade fora da faixa para sair):"));
         //if e else para condição
            if (idade < 0 || idade > 120) {
                break;
            }

            if (idade < 21) {
                totalMenor21++;
            }
            if (idade > 50) {
                totalMaior50++;
            }
        }
        //resultado

        String resultado = "Total de pessoas com menos de 21 anos: " + totalMenor21 + "\n" +
                           "Total de pessoas com mais de 50 anos: " + totalMaior50;
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
