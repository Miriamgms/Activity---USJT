//Aula 07 Exercício 5

import java.util.ArrayList;
public class CarrinhoDeCompras {
    
    private ArrayList<ItemCarrinho> itens = new ArrayList<>();

    public void adicionaItem(ItemCarrinho item) {
        itens.add(item);
    }

    public void removeItem(ItemCarrinho item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getPreco();
        }
          return total;
    }

    public String exibeItens() {
        StringBuilder sb = new StringBuilder();
        for (ItemCarrinho item : itens) {
            sb.append(item.getDescricao()).append("\n");
        }
        return sb.toString();
    }
}
