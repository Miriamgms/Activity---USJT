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

import javax.swing.JOptionPane;

public class Teste_Circulo {
    public static void main(String[] args) {
        String sRaio = JOptionPane.showInputDialog("Digite o raio do círculo:");
        
        double raio = Double.parseDouble(sRaio);
        
        Circulo circulo = new Circulo(raio);
        
        double area = circulo.calcularArea();
        double perimetro = circulo.calcularPerimetro();
        
        String resultado = "Área: " + area + "\nPerímetro: " + perimetro;
        JOptionPane.showMessageDialog(null, resultado, "Resultado do Círculo", JOptionPane.INFORMATION_MESSAGE);
    }
}
