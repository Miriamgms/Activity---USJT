public class Boleto extends Pagamento{
    // Atributos
    private String numeroDoBoleto;
    private int diaVenc;
    private int mesVenc;
    private int anoVenc;

    // Construtor
    public Boleto(String n, String c, double v, String numBoleto, int dv, int mv, int av){
        super(n, c, v);
        numeroDoBoleto = numBoleto;
        diaVenc = dv;
        mesVenc = mv;
        anoVenc = av;
    }


    // Métodos de acesso
    public String getNumeroDoBoleto(){
        return numeroDoBoleto;
    }
    public int getDiaVenc(){
        return diaVenc;
    }
    public int getMesVenc(){
        return mesVenc;
    }
    public int getAnoVenc(){
        return anoVenc;
    }



    // Métodos modificadores
    public void setNumeroDoBoleto(String numBoleto){
        numeroDoBoleto = numBoleto;
    }
    public void setDiaVenc(int dv){
        diaVenc = dv;
    }
    public void setMesVenc(int mv){
        mesVenc = mv;
    }
    public void setAnoVenc(int av){
        anoVenc = av;
    }

}
