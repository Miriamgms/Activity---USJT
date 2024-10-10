// Solução 3 Aula 04


//Classe Produto
public class Produto 
{
    //atributos
    private String nome;
    private double preço;
    private int quantidade;
   //método construtor
 public Produto(String n, double p, int q)
 {
    nome = n;
    preço = p;
    quantidade = q;
 }
 // métodos de acesso
public String getNome() 
    {
    return nome;
    }  
public double getPreço()
    {
    return preço;
    }
public int getQuantidade() 
    {
    return quantidade;
    }
    // métodos modificadores
public void setNome(String n) 
    {
    nome = n;
    } 
public void setPreço(double p) 
   {
    preço = p;
   }
public void setQuantidade(int q)
{
 quantidade = q;
}
}



//Classe TesteProduto
import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) 
    {
        //coletando dados do produto
        String nome = JOptionPane.showInputDialog("Nome do produto");
        double preço = Double.parseDouble(JOptionPane.showInputDialog("Preço")); 
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
         // cria um objeto produto
         Produto produto = new Produto(nome, preço, quantidade);

         // monta a String de saida chamando os metodos de acesso do produto
         String msg = "Nome: " + produto.getNome() + 
                      "\nPreço unidade: " + produto.getPreço() + 
                      "\nQuantidade: " + produto.getQuantidade();
                      
                      JOptionPane.showMessageDialog(null, msg);

    }
}
