//Aula 07 Exercicio 2

import javax.swing.*;

public class Teste2
{
    public static void main(String[] args) {

      double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo:"));
       Circulo c = new Circulo(raio);
       JOptionPane.showMessageDialog(null," o perimetro do circulo é "+c.calcularPerimetro()+"\n a area do circulo é "+ c.calcularArea());

        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do retangulo:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retangulo:"));

        Retangulo r = new Retangulo(largura, altura);

        JOptionPane.showMessageDialog(null," o perimetro do retangulo é: "+r.calcularPerimetro()+"\n a area do retangulo é: "+ r.calcularArea());


    }
}
