public class Pagamento{
    //atributos
    private String nomeDoPagador;
    private String cpf;
    private double valoraserpago;
    
    
    // Construtor
    public Pagamento(String n, String c, double v)
    {
    nomeDoPagador = n;
    cpf = c;
    valoraserpago = v;
    }
    
    
    // Métodos de acesso
    public String getNomeDoPagador(){
    return nomeDoPagador;
    }
    
    public String getCpf(){
    return cpf;
    }
    
    public double getValoraserpago(){
    return valoraserpago;
    }
    
    
    
    // Métodos modificadores
    public void setNomeDoPagador(String n){
    nomeDoPagador = n;
    }
    
    public void setCpf(String c){
    cpf = c;
    }
    
    public void setValoraserpago(double v){
    valoraserpago = v;
    }
    }
