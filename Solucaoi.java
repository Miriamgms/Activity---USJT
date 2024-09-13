//exercicio aula 01 - 1i
import javax.swing.JOptionPane;
  public class Solucao1i
{
  public static void main(String[] args)
  {
      //leitura de valor
       String sValor = JOptionPane.showInputDialog("Digite um número inteiro:");
        double valor = Double.parseDouble(sValor);
            //elevando ao quadrado
        Double resultado = Math.pow(numero, 2);
          //exibir
   JOptionPane.showMessageDialog(null, “O numero ao quadrado é:” + resultado);
   }
}

//*Anotações: Math.pow = A linguagem Java está equipada com uma biblioteca abrangente para funções e operações matemáticas. Ela é chamada de classe "Math" e reside no pacote java.lang 
//A biblioteca Math inclui métodos para operações numéricas fundamentais, trigonometria, encontrar min-max, gerar números aleatórios e operações logarítmicas. 
//Agora, falando sobre o método Math.pow() , ele é usado para calcular potências de números usando uma base e um expoente
