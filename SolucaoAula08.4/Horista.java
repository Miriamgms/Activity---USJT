
public class Horista extends Empregado {
    private double valorHora;
    private int horasTrabalhadas;
    public Horista() {
        super();
        this.valorHora = 0.0;
        this.horasTrabalhadas = 0;
    }

    public Horista(String nome, String sobrenome, String cpf, double valorHora, int horasTrabalhadas) {
        super(nome, sobrenome, cpf, valorHora * horasTrabalhadas);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
        setSalario(valorHora * this.horasTrabalhadas); // Atualiza o salário
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        setSalario(this.valorHora * horasTrabalhadas); // Atualiza o salário
    }

    
    public String dados() {
        return super.dados() + ", Valor por Hora: R$" + valorHora + ", Horas Trabalhadas: " + horasTrabalhadas;
    }
}
