package Produto;

public class ProdutoView {
	
	public void imprimeProduto(int ProdutoId, String nomeProduto, String descricaoProduto, int estoque, double preco ) {
		System.out.println("Produto");
		System.out.println("\nCódigo do Produto: " + ProdutoId);
		System.out.println("Nome do Produto: " + nomeProduto);
		System.out.println("Breve descrição: " + descricaoProduto);
		System.out.println("Quantidade em estoque: " + estoque);
		System.out.println("Preço: " + preco);
	}
}
