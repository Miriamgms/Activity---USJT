public class CartaoDeCredito extends Pagamento{
    // Atributo 
    private String numeroDoCartao;
    
    // Construtor
    public CartaoDeCredito(String n, String c, double v, String num){
        super(n, c, v);
        numeroDoCartao = num;
    }


     // Métodos de acesso
     public String getNumeroDoCartao(){
        return numeroDoCartao;
    }



    // Métodos modificadores
    public void setNumeroDoCartao(String num) {
        numeroDoCartao = num;
    }
    
}
