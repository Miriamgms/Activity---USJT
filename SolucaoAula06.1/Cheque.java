public class Cheque extends Pagamento{
    // Atributo
    private String numeroDoCheque;


    // Construtor
    public Cheque(String n, String c, double v, String numcheque){
        super(n, c, v);
        numeroDoCheque = numcheque;
    }


    // Métodos de acesso
    public String getNumeroDoCheque(){
    return numeroDoCheque;
    }


    // Métodos modificadores
    public void setNumeroDoCheque(String numcheque){
    numeroDoCheque = numcheque;
    }
}
