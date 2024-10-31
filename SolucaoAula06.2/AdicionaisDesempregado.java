public class AdicionaisDesempregado extends PessoaFisica {
    private double seguroDesemprego;

    // Construtor sem parâmetros
    public AdicionaisDesempregado() {
        super();
        this.seguroDesemprego = 0.0;
    }

    // Construtor com parâmetros
    public AdicionaisDesempregado(String nome, String sobrenome, String cpf, double seguroDesemprego) {
        super(nome, sobrenome, cpf);
        this.seguroDesemprego = seguroDesemprego;
    }

    // Métodos de acesso
    public double getSeguroDesemprego() {
        return seguroDesemprego;
    }

    // Métodos modificadores
    public void setSeguroDesemprego(double seguroDesemprego) {
        this.seguroDesemprego = seguroDesemprego;
    }
    
    
    public String dados() {
        return super.dados() + "\nSeguro Desemprego: R$ " + seguroDesemprego;
    }
}
