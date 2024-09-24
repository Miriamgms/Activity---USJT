/* Aula: 02 Desvio Condicional if, if–else, if–else if–else; Operadores Relacionais e Operadores Lógicos */
import javax.swing.JOptionPane;

public class SolucaoAula2_20 
{
    public static void main(String[] args) 
    {
        // Ler os dois números
        String sprimeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número:");
        String ssegundoNumero = JOptionPane.showInputDialog("Digite o segundo número:");

        // Converter para int
        int primeiroNumero = Integer.parseInt(sprimeiroNumero);
        int segundoNumero = Integer.parseInt(ssegundoNumero);

        // Inicializar variáveis para o menor e maior número
        int menor, maior;

        // Verificar qual é o menor e qual é o maior
        if (primeiroNumero < segundoNumero)
         {
            menor = primeiroNumero;
            maior = segundoNumero;
        } 
        else 
        {
            menor = segundoNumero;
            maior = primeiroNumero;
        }

        // Calcular o quadrado do menor número
        int quadradoMenor = menor * menor;

        // Calcular a raiz quadrada do maior número, se for possível
        String resultado;
        if (maior >= 0)
         {
            double raizMaior = Math.sqrt(maior);
            resultado = "O quadrado do menor número (" + menor + ") é: " + quadradoMenor +
                        "\nA raiz quadrada do maior número (" + maior + ") é: " + raizMaior;
        } 
        else 
        {
            resultado = "O quadrado do menor número (" + menor + ") é: " + quadradoMenor +
                        "\nNão é possível calcular a raiz quadrada do maior número (" + maior + ") pois é negativo.";
        }

        // Apresentar os resultados
        JOptionPane.showMessageDialog(null, resultado);
    }
}

//anotações: usar \n para pular linha
