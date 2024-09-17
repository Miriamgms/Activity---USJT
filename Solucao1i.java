//exercicio aula 01 - Operadores Aritméticos, Expressões Aritméticas e Strings'9'
import javax.swing.JOptionPane;
  public class Solucao1i
{
  public static void main(String[] args)
  {
      //leitura de valor
       String sValor = JOptionPane.showInputDialog("Digite um número inteiro:");
       int valor = Integer.parseInt (sValor);
       double quadrado = Math.pow(valor, 2);
     //System.out.println ( "O valor digitado ao quadrado = " + Math.pow(valor,2));    
     JOptionPane.showMessageDialog (null, "O valor digitado ao quadrado = " + Math.pow(valor,2));
   }
}
  

//*Anotações: Math.pow = A linguagem Java está equipada com uma biblioteca abrangente para funções e operações matemáticas. Ela é chamada de classe "Math" e reside no pacote java.lang 
//A biblioteca Math inclui métodos para operações numéricas fundamentais, trigonometria, encontrar min-max, gerar números aleatórios e operações logarítmicas. 
//Agora, falando sobre o método Math.pow() , ele é usado para calcular potências de números usando uma base e um expoente
