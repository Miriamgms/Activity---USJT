//Solucao Aula 5 - PART. 1 (C)
public class Atribuicao {
    //atributos
    private Professor professor;
    private Discipliina discipliina;
    //construtor
    public Atribuicao(Professor professor, Discipliina discipliina){
        this.professor = professor;
        this.discipliina = discipliina;
    }
    //métodos de acesso
    public Professor getProfessor(){
        return professor;
    }
    public Discipliina getDiscipliina(){
        return  discipliina;
    }
    public String getDados() {
        return "\nDisciplina | " + discipliina.getDados() + "\nProfessor | " + professor.getDados();
    }
}
