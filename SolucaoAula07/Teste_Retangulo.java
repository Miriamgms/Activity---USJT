//Solução Aula 07 - Exercício 2

/*public abstract class Forma
{
public abstract double calcularArea();
}
-------------------------------------
public class Retangulo extends Forma
{
private double largura;
private double altura;

public Retangulo(double largura, double altura){
this.largura = largura;
this.altura = altura;
}
public double calcularArea(){
return largura * altura;
}
public double calcularPerimetro()
{
return 2 * (largura + altura);
}
} */

//classe teste abaixo

public class Teste_Retangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 3);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}

