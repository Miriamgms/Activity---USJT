//Solução 2 Aula 04
import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) 
    {
        //colentando dados para cadastrar nova turma 
        String curso = JOptionPane.showInputDialog("curso");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Serie"));
        String nome = JOptionPane.showInputDialog("Nome");
        // cria um objeto turma
         Turma turma = new Turma(curso, quantidadeDeAlunos, serie, nome);
         // monta a String de saida chamando os metodos de acesso da turma
         String msg = "Curso: " + turma.getCurso() + 
                      "\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() + 
                      "\nSerie: " + turma.getSerie() + 
                      "\nNome: " + turma.getNome();
                      JOptionPane.showMessageDialog(null, msg);
                      // altera informacoes; nao precisa criar todas as variaveis novamente
                    quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nova quantidade de alunos"));
                    turma.setQuantidadeDeAlunos(quantidadeDeAlunos);
                    msg = "Curso: " + turma.getCurso() + 
                      "\nQuantidade de alunos: " + turma.getQuantidadeDeAlunos() + 
                      "\nSerie: " + turma.getSerie() + 
                      "\nNome: " + turma.getNome();
                      JOptionPane.showMessageDialog(null, msg);
    }
}
