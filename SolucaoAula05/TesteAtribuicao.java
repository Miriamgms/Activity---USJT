//Solucao Aula 5 - PART. 1 (D)
import javax.swing.JOptionPane;
public class TesteAtribuicao {
    public static void main(String[] args) {
        // Coletar informações do professor
        String nomeProfessor = JOptionPane.showInputDialog("Nome do professor");
        int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("Idade do professor"));

        // Criar um objeto Professor
        Professor professor = new Professor(nomeProfessor, idadeProfessor);

        // Coletar informações da disciplina
        String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina");
        boolean pratica = JOptionPane.showConfirmDialog(null, "A disciplina é prática?") == JOptionPane.YES_OPTION;

        // Criar um objeto Discipliina
        Discipliina discipliina = new Discipliina(nomeDisciplina, pratica);

        // Criar um objeto Atribuicao
        Atribuicao atribuicao = new Atribuicao(professor, discipliina);

        // Imprimir os dados da atribuição
        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}

//anotações "YES_OPTION" USADO PARA COLOCAR OPÇÕES DE BOTÃO COM SIM OU NÃO
