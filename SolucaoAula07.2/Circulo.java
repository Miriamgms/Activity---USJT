//Aula 07 Exercício 2

public class Circulo extends Forma{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);

    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }


}
