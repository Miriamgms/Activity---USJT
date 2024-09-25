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



/*A classe StringBuilder em Java é usada para criar e manipular strings de forma mais eficiente do que usando a classe String comum. 
Aqui estão algumas de suas principais características e vantagens:

Mutabilidade: Diferente da classe String, que é imutável (ou seja, uma vez criada, não pode ser alterada),
StringBuilder permite modificar o conteúdo da string sem criar novos objetos.

Performance: Quando você precisa fazer muitas operações de concatenação ou modificação de strings, 
StringBuilder é mais eficiente em termos de desempenho. Isso ocorre porque ele mantém um buffer interno 
que pode ser alterado, evitando a criação de múltiplos objetos.

Métodos úteis: StringBuilder possui diversos métodos que facilitam a manipulação de strings, como append(), 
insert(), delete(), reverse(), entre outros.*/
