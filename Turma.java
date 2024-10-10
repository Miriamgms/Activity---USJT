//Solução 1 Aula 04
public class Turma 
{
    // atributos
    private String curso;
    private int quantidadeDeAlunos;
    private int serie;
    private String nome;
    // método construtor
    public Turma(String c, int q, int s, String n)
     {
    curso = c;
    quantidadeDeAlunos = q;
    serie = s;
    nome = n;
    }
    // métodos de acesso
    public String getCurso() 
    {
    return curso;
    }
    public int getQuantidadeDeAlunos() 
    {
    return quantidadeDeAlunos;
    }
    public int getSerie() 
    {
    return serie;
    }
    public String getNome()
    {
    return nome;
    }

    // métodos modificadores
    public void setCurso(String c)
    {
    curso = c;
    }
    public void setQuantidadeDeAlunos(int q) 
    {
    quantidadeDeAlunos = q;
    }
    public void setSerie(int s)
    {
    serie = s;
    }
    public void setNome(String n) 
    {
    nome = n;
    }
    }
