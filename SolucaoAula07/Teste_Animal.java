//Solução Aula 07 - Exercício 3

/*public interface Animal{
public void fazerSom();
public void mover();
}*/

//classe teste abaixo


public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.fazerSom();         
        animal.mover(); 
    }
}
