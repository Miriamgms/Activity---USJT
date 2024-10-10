//Solução 4 Aula 4


//Classe Disciplina
public class Disciplina 
{
    // Atributos
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    // Método construtor
    public Disciplina(String n, String p, int s, boolean o) {
        nome = n;
        professor = p;
        semestre = s;
        ofertada = o; // Atribui o valor do parâmetro
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public boolean getOfertada() {
        return ofertada;
    }

    // Métodos modificadores
    public void setNome(String n) {
        nome = n;
    }

    public void setProfessor(String p) {
        professor = p;
    }

    public void setSemestre(int s) {
        semestre = s;
    }

    public void setOfertada(boolean o) {
        ofertada = o;
    }
}


//Classe TesteDisciplina
import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {
        // Coletando dados para cadastrar disciplina
        String nome = JOptionPane.showInputDialog("Nome da Disciplina:");
        String professor = JOptionPane.showInputDialog("Professor:");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre:"));
        
        // Coletando se a disciplina é ofertada
        boolean ofertada = Boolean.parseBoolean(JOptionPane.showInputDialog("A disciplina é ofertada? (true/false):"));

        // Criar objeto Disciplina
        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        // Monta a String de saída
        String msg = "Nome: " + disciplina.getNome() + 
                     "\nProfessor: " + disciplina.getProfessor() + 
                     "\nSemestre: " + disciplina.getSemestre();

        // Usando if e else para definir se é ofertada
        if (disciplina.getOfertada()) {
            msg += "\nOfertada: sim";
        } else {
            msg += "\nOfertada: não";
        }

        // Exibir mensagem
        JOptionPane.showMessageDialog(null, msg);
    }
}
