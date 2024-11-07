//Solução Aula 07 - Exercício 2

/*public abstract class Forma
{
public abstract double calcularArea();
}
-------------------------------------
public class Circulo extends Forma{
private double raio;

public Circulo(double raio)
{
this.raio = raio;
}
public double calcularArea(){
return Math.PI * raio * raio;
}
public double calcularPerimetro()
{
return 2 * Math.PI * raio;
}
}*/

//classe teste abaixo

public class Teste_Circulo {
    public static void main(String[] args)
  {
        Circulo circulo = new Circulo(4);
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}
