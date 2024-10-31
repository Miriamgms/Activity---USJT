public class Desempregado extends PessoaFisica {
    private double seguroDesemprego;

    // Construtor sem parâmetros
    public Desempregado() {
        super(); // Chama o construtor da superclasse
        this.seguroDesemprego = 0.0;
    }

    // Construtor com parâmetros
    public Desempregado(String nome, String sobrenome, String cpf, double seguroDesemprego) {
        super(nome, sobrenome, cpf);
        this.seguroDesemprego = seguroDesemprego;
    }

    public double getSeguroDesemprego() {
        return seguroDesemprego;
    }

    public void setSeguroDesemprego(double seguroDesemprego) {
        this.seguroDesemprego = seguroDesemprego;
    }

   
    public String dados() {
        return super.dados() + "\nSeguro Desemprego: R$ " + seguroDesemprego;
    }
}
