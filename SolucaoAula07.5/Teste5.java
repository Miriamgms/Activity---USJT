//Aula 07 exercício 5
public class Teste5 {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        
        carrinho.adicionaItem(new Produto(10.0, "Livro"));
        carrinho.adicionaItem(new Produto(20.0, "Caneta"));

   
        System.out.println("Total do Carrinho: " + carrinho.calculaTotal());

  
        System.out.println("Itens no Carrinho:\n" + carrinho.exibeItens());

        carrinho.removeItem(new Produto(10.0, "Livro"));
        System.out.println("Total do Carrinho após remover um item: " + carrinho.calculaTotal());
        System.out.println("Itens no Carrinho após remoção:\n" + carrinho.exibeItens());
    }
}
