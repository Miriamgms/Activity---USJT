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

import javax.swing.JOptionPane;

public class Teste_Retangulo {
    public static void main(String[] args) {
        String sLargura = JOptionPane.showInputDialog("Digite a largura do retângulo:");
        String sAltura = JOptionPane.showInputDialog("Digite a altura do retângulo:");
        
        double largura = Double.parseDouble(sLargura);
        double altura = Double.parseDouble(sAltura);
        
        Retangulo retangulo = new Retangulo(largura, altura);
        
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        
        String resultado = "Área: " + area + "\nPerímetro: " + perimetro;
        JOptionPane.showMessageDialog(null, resultado, "Resultado do Retângulo", JOptionPane.INFORMATION_MESSAGE);
    }
}


