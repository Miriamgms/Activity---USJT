
public class Empregado extends PessoaFisica {
    private double salario;

    public Empregado() {
        super();
        this.salario = 0.0;
    }

    public Empregado(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public String dados() {
        return super.dados() + ", Salário: R$" + salario;
    }
}
