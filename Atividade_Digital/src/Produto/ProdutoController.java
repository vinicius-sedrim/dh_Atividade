package Produto;

public class ProdutoController {
	Produto model;
	ProdutoView view;
	
	public ProdutoController(Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setProdutoId(int idProduto) {
		model.setProdutoId(idProduto);;
	}
	
	public int setIdProduto() {
		return model.getProdutoId();
	}
	
	public void setNomeProduto(String nomeProduto) {
		model.setNomeProduto(nomeProduto);
	}
	
	public String getNomeProduto() {
		return model.getNomeProduto();
	}
	
	public void setDescricaoProduto(String descricaoProduto) {
		model.setDescricaoProduto(descricaoProduto);
	}
	
	public String getDescricaoProduto() {
		return model.getDescricaoProduto();
	}
	
	public void setEstoqueProduto(int estoqueProduto) {
		model.setEstoque(estoqueProduto);
	}
	
	public int getEstoqueProduto() {
		return model.getEstoque();
	}
	
	public void setPrecoProduto(double precoProduto) {
		model.setPreco(precoProduto);
	}
	
	public double getPrecoProduto() {
		return model.getPreco();
	}
	
	public void atualizarView() {
		view.imprimeProduto(model.getProdutoId(),
		model.getNomeProduto(), model.getDescricaoProduto(), 
		model.getEstoque(), model.getPreco());
	}
}
