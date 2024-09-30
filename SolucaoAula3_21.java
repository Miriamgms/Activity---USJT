import javax.swing.JOptionPane;

public class SolucaoAula3_21
 {
    public static void main(String[] args) 
    {
        // Lê a quantidade de pessoas a serem cadastradas
        String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade de pessoas a serem cadastradas:");
        int quantidade = Integer.parseInt(quantidadeStr); // Converte a string para inteiro

        // Arrays para armazenar os dados
        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];
        String[] sexos = new String[quantidade];

        // Loop para coletar dados da quantidade de pessoas especificada
        for (int i = 0; i < quantidade; i++) 
        {
            // Lê o nome
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
            // Lê a idade
            String idadeStr = JOptionPane.showInputDialog("Digite a idade de " + nomes[i] + ":");
            idades[i] = Integer.parseInt(idadeStr); // Converte a string para inteiro
            // Lê o sexo
            sexos[i] = JOptionPane.showInputDialog("Digite o sexo (M/F) de " + nomes[i] + ":").toUpperCase(); // Converte para maiúsculo
        }

        // StringBuilder para armazenar os nomes que atendem às condições
        StringBuilder nomesFiltrados = new StringBuilder();

        // Loop para verificar as condições e armazenar os nomes
        for (int i = 0; i < quantidade; i++)
         {
            // Verifica se é masculino e se a idade é maior que 21
            if (sexos[i].equals("M") && idades[i] > 21) 
            {
                nomesFiltrados.append(nomes[i]).append("\n"); // Adiciona o nome à lista
            }
        }

        // Exibe os nomes que atendem às condições em uma caixa de diálogo
        if (nomesFiltrados.length() > 0)
         {
            JOptionPane.showMessageDialog(null, "Nomes dos homens com mais de 21 anos:\n" + nomesFiltrados.toString());
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Nenhum homem com mais de 21 anos foi encontrado.");
        }
    }
}
