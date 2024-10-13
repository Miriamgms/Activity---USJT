//Solucao Aula 5 - PART. 1 (B)
public class Discipliina
{
    //atributos
    private String snome;
    private boolean pratica;
    //construtor
    public Discipliina(String snome, boolean pratica){
        this.snome = snome;
        this.pratica = pratica;
    }
    //métodos de acesso
    public String getsNome(){
        return snome;
    }
    public boolean getPratica(){
        return pratica;
    }
    //metodo getDados
 public String getDados(){
    return "Nome da disciplina: " + snome + "\nPrática:" + pratica;
 }
}
