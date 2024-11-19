
public class Tarefeiro extends Empregado {
    private double valorPorTarefa;
    private int tarefasConcluidas;

    public Tarefeiro() {
        super();
        this.valorPorTarefa = 0.0;
        this.tarefasConcluidas = 0;
    }

    public Tarefeiro(String nome, String sobrenome, String cpf, double valorPorTarefa, int tarefasConcluidas) {
        super(nome, sobrenome, cpf, valorPorTarefa * tarefasConcluidas);
        this.valorPorTarefa = valorPorTarefa;
        this.tarefasConcluidas = tarefasConcluidas;
    }

    public double getValorPorTarefa() {
        return valorPorTarefa;
    }

    public int getTarefasConcluidas() {
        return tarefasConcluidas;
    }

    public void setValorPorTarefa(double valorPorTarefa) {
        this.valorPorTarefa = valorPorTarefa;
        setSalario(valorPorTarefa * this.tarefasConcluidas); // Atualiza o salário
    }

    public void setTarefasConcluidas(int tarefasConcluidas) {
        this.tarefasConcluidas = tarefasConcluidas;
        setSalario(this.valorPorTarefa * tarefasConcluidas); // Atualiza o salário
    }

   
    public String dados() {
        return super.dados() + ", Valor por Tarefa: R$" + valorPorTarefa + ", Tarefas Concluídas: " + tarefasConcluidas;
    }
}
