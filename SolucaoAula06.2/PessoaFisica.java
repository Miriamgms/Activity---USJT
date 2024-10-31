public class PessoaFisica {
    // Atributos
    private String nome;
    private String sobrenome;
    private String cpf;

    // Construtor sem parâmetros
    public PessoaFisica() {
        setNome("Nome Padrão");
        setSobrenome("Sobrenome Padrão");
        setCpf("000.000.000-00");
    }

    // Construtor com parâmetros
    public PessoaFisica(String nome, String sobrenome, String cpf) {
        setNome(nome);
        setSobrenome(sobrenome);
        setCpf(cpf);
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    // Métodos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método que retorna os dados em formato String
    public String dados() {
        return "Nome: " + nome + "\n" +
               "Sobrenome: " + sobrenome + "\n" +
               "CPF: " + cpf;
    }
}

