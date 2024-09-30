import javax.swing.JOptionPane;

public class SolucaoAula3_25
 {
    public static void main(String[] args) 
   {
        
        int[] votos = new int[4]; 
        int totalVotos = 0; // Total de votos
        
        int voto; // Variável para armazenar o voto do aluno

        // Loop para coletar os votos até que o usuário digite -1
        do {
            // Solicita o voto
            String votoStr = JOptionPane.showInputDialog("Digite o número do candidato (1, 2, 3 ou 4) ou -1 para encerrar:");
            voto = Integer.parseInt(votoStr); // Converte a string para inteiro

            // Verifica se o voto é válido (1 a 4)
            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++; // Incrementa o voto do candidato correspondente
                totalVotos++; // Incrementa o total de votos
            } else if (voto != -1) {
                JOptionPane.showMessageDialog(null, "Voto inválido! Por favor, digite 1, 2, 3, 4 ou -1 para encerrar.");
            }
        } while (voto != -1); // Repete até que -1 seja digitado

        // Exibe o resultado
        StringBuilder resultado = new StringBuilder("Resultados da eleição:\n");
        for (int i = 0; i < votos.length; i++) {
            double percentual = (totalVotos > 0) ? (votos[i] / (double) totalVotos) * 100 : 0; // Calcula o percentual
            resultado.append("Candidato ").append(i + 1).append(": ").append(votos[i]).append(" votos (").append(String.format("%.2f", percentual)).append("%)\n");
        }
        resultado.append("Total de alunos eleitores: ").append(totalVotos);

        // Exibe os resultados em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
