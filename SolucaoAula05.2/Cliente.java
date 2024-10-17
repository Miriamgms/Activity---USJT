//Solução Aula 5 - PART. 2 (A)

public class Cliente { 
//atributos
private String nome;
private String cpf;
private ContaCorrente contacorrente;
//método construtor 
public Cliente(String nome, String cpf, ContaCorrente contacorrente){
this.nome = nome;
this.cpf = cpf;
this.contacorrente = contacorrente;
 }
//métodos de acesso
public String getNome(){ 
return nome;
}
public String getCpf(){ 
return cpf;
}
public ContaCorrente getContaCorrente(){
  return contacorrente;
}
//método modificadores
public void setNome(String nome) {
this.nome = nome;
}
public void setCpf(String cpf) {
this.cpf = cpf;
}
public void setContaCorrente(ContaCorrente contacorrente) {
 this.contacorrente = contacorrente;
}
  //metodo getDados
public String getDados() {
  return "Cliente " + nome + " CPF " + cpf + " Conta " + contacorrente.getDados();
 }
}
