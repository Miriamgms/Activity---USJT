import javax.swing.JOptionPane;

public class Solucao23 
{
    public static void main(String[] args)
     {
        // Entrada dos números
        String snum1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String snum2 = JOptionPane.showInputDialog("Digite o segundo número:");
        String snum3 = JOptionPane.showInputDialog("Digite o terceiro número:");

        // Conversão para inteiro
        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);
        int num3 = Integer.parseInt(snum3);

        int maior, intermediario, menor;

        // Determinação dos números
        if (num1 > num2 && num1 > num3) 
        {
            maior = num1;
        if (num2 > num3) 
        {
           intermediario = num2;
             menor = num3;
        } 
           
        else
       {
         intermediario = num3;
            menor = num2;
       }
     } 
       else if (num2 > num1 && num2 > num3) 
     {
            maior = num2;
       if (num1 > num3) 
     {
         intermediario = num1;
              menor = num3;
     } 
       else 
     {
        intermediario = num3;
                menor = num1;
       }
     } 
        else 
     {
        maior = num3;
        if (num1 > num2) 
     {
         intermediario = num1;
                menor = num2;
      } 
      else 
      {
          intermediario = num2;
                  menor = num1;
       }
      }

        // Apresentação do resultado
        String resultado = "Maior: " + maior + "\n" +
                           "Intermediário: " + intermediario + "\n" +
                           "Menor: " + menor;
        JOptionPane.showMessageDialog(null, resultado);
    }
}
