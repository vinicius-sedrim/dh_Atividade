package Produto;

public class ProdutoPedidoController {
	private ProdutoPedido model;
	private ProdutoPedidoView view;
	
	public ProdutoPedidoController(ProdutoPedido model, ProdutoPedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFkCliente(int fkCliente) {
		model.setCliente(fkCliente);
	}
	
	public int getFkCliente() {
		return model.getCliente();
	}
	
	public void setfkPedido(int fkPedido) {
		model.setPedido(fkPedido);
	}
	
	public int getfkPedido() {
		return model.getPedido();
	}
	
	public void setQtdeProduto(String qtdeProduto) {
		model.setQtdeProduto(qtdeProduto);
	}
	
	public String getQtdeProduto() {
		return model.getQtdeProduto();
	}
	
	public void atualizarView() {
		view.imprimeProdutoPedido(model.getCliente(), model.getPedido(),
		model.getQtdeProduto());
	}
}
