package Produto;

public class Produto {
	private int produtoId, estoque ;
	private String nomeProduto, descricaoProduto;
	private double preco;
	
	public int getProdutoId() {
		return produtoId;
	}
	
	public void setProdutoId(int produtoId) {
		this.produtoId = produtoId;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public String getDescricaoProduto() {
		return descricaoProduto;
	}
	
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
