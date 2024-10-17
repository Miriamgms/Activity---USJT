import javax.swing.JOptionPane;

public class Usuario {
    public static void main(String[] args) {
        // Instanciando o condicionador de ar
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        
       
        condicionador.ligar(); 
        condicionador.setTermostato(30.0); 

       
        condicionador.setTermostato(10.0); 

        // Aumentando a temperatura para 25 graus
        condicionador.setTermostato(25.0);
        condicionador.imprimirTemperatura();
    }
}
