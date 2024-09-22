import javax.swing.JOptionPane;

public class Solucao4 
{ 
    public static void main(String[] args) 
    {
        // Lendo três números
        String sValor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String sValor2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String sValor3 = JOptionPane.showInputDialog("Digite o terceiro número:");
        
        // Convertendo para int
        int num1 = Integer.parseInt(sValor1);
        int num2 = Integer.parseInt(sValor2);
        int num3 = Integer.parseInt(sValor3);
        
        // Armazenar os números em ordem crescente
        int menor, meio, maior;
        
        // Utilizando if e else para determinar a ordem crescente
        if (num1 <= num2 && num1 <= num3) 
        {
            menor = num1;
            if (num2 <= num3) 
            {
                meio = num2;
                maior = num3;
            } 
            else 
            {
                meio = num3;
                maior = num2;
            }
        } 
        else if (num2 <= num1 && num2 <= num3) 
        {
            menor = num2;
            if (num1 <= num3) 
            {
                meio = num1;
                maior = num3;
            }
             else
              {
                meio = num3;
                maior = num1;
            }
        } 
        else 
        {
            menor = num3;
            if (num1 <= num2) 
            {
                meio = num1;
                maior = num2;
            } 
            else
             {
                meio = num2;
                maior = num1;
            }
        }
        
        // Apresentar os números em ordem crescente
        String resultado = menor + ", " + meio + ", " + maior;
        JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + resultado);
    }
}
