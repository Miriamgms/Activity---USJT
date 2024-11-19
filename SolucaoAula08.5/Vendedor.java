
public class Vendedor extends Empregado {
    private double salarioBase;
    private double comissaoPorVenda;
    private int vendasRealizadas;

    public Vendedor() {
        super();
        this.salarioBase = 0.0;
        this.comissaoPorVenda = 0.0;
        this.vendasRealizadas = 0;
    }

    public Vendedor(String nome, String sobrenome, String cpf, double salarioBase, double comissaoPorVenda, int vendasRealizadas) {
        super(nome, sobrenome, cpf, salarioBase + (comissaoPorVenda * vendasRealizadas));
        this.salarioBase = salarioBase;
        this.comissaoPorVenda = comissaoPorVenda;
        this.vendasRealizadas = vendasRealizadas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissaoPorVenda() {
        return comissaoPorVenda;
    }

    public int getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        setSalario(salarioBase + (this.comissaoPorVenda * this.vendasRealizadas)); // Atualiza o salário
    }

    public void setComissaoPorVenda(double comissaoPorVenda) {
        this.comissaoPorVenda = comissaoPorVenda;
        setSalario(this.salarioBase + (comissaoPorVenda * this.vendasRealizadas)); // Atualiza o salário
    }

    public void setVendasRealizadas(int vendasRealizadas) {
        this.vendasRealizadas = vendasRealizadas;
        setSalario(this.salarioBase + (this.comissaoPorVenda * vendasRealizadas)); // Atualiza o salário
    }

   
    public String dados() {
        return super.dados() + ", Salário Base: R$" + salarioBase + ", Comissão por Venda: R$" + comissaoPorVenda + ", Vendas Realizadas: " + vendasRealizadas;
    }
}
