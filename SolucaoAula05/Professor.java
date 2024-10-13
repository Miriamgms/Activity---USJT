//Solucao Aula 5 - PART. 1 (A)
public class Professor
 {
    private String nome;
    private int idade;
    //construtor
    public Professor(String nome, int idade)
{
     this.nome = nome;
     this.idade = idade;
}
//metodos de acesso
public String getNome(){
    return nome;
    }
public int getIdade(){
    return idade;
}
//metodos modificadores
public void setNome(String nome){
    this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    //metodo getDados
public String getDados() {
return "Nome do Professor: " + nome + "\n Idade: " + idade;
 }
}

