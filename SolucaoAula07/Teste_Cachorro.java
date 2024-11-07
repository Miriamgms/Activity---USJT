//Solução Aula 07 - Exercício 3

/* public class Cachorro implements Animal{
public void fazerSom()
{
System.out.println("Au au!");
}
public void mover()
{
System.out.println("O cachorro está correndo");
}
}*/

//classe teste abaixo

public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.mover(); 
    }
}
