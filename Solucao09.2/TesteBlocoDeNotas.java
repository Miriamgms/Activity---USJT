
import javax.swing.*;

public class TesteBlocoDeNotas {

    public static void main(String[] args) {
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "Escolha uma opção:\n" +
                            "1) Inserir nota\n" +
                            "2) Remover nota\n" +
                            "3) Atualizar nota\n" +
                            "4) Listar notas\n" +
                            "5) Sair"
            );


            if (opcao == null) {
                continue;
            }

            if (opcao.equals("1")) {
                String nota = JOptionPane.showInputDialog("Digite a nota para inserir:");
                if (nota != null) {
                    blocoDeNotas.inserirNota(nota);
                }
            } else if (opcao.equals("2")) {
                String nota = JOptionPane.showInputDialog("Digite a nota para remover:");
                if (nota != null) {
                    blocoDeNotas.removerNota(nota);
                }
            } else if (opcao.equals("3")) {
                String notaAntiga = JOptionPane.showInputDialog("Digite a nota que deseja atualizar:");
                String notaNova = JOptionPane.showInputDialog("Digite o novo conteúdo da nota:");
                if (notaAntiga != null && notaNova != null) {
                    blocoDeNotas.atualizarNota(notaAntiga, notaNova);
                }
            } else if (opcao.equals("4")) {
                blocoDeNotas.listarNotas();
            } else if (opcao.equals("5")) {
                JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }
}
