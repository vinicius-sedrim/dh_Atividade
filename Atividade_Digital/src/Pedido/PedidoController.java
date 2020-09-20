package Pedido;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFkCliente(int Cliente) {
		model.setCliente(Cliente);
	}
	
	public int getFkCliente() {
		return model.getCliente();
	}
	
	public void setNotaFiscal(int notaFiscal) {
		model.setNotaFiscal(notaFiscal);
	}
	
	public int getNotaFiscal() {
		return model.getNotaFiscal();
	}
	
	public void setDataEmissao(String dataEmissao) {
		model.setEmissao(dataEmissao);
	}
	
	public String getDataEmissao() {
		return model.getEmissao();
	}
	
	public void setValorTotal(double valorTotal) {
		model.setTotal(valorTotal);
	}
	
	public double getValorTotal() {
		return model.getTotal();
	}
	
	public void setStatusPedido(String statusPedido) {
		model.setStatus(statusPedido);
	}
	
	public String getStatusPedido() {
		return model.getStatus();
	}
	
	public void atualizarView() {
		view.imprimePedido(model.getCliente(),
		model.getNotaFiscal(), model.getEmissao(),
		model.getTotal(), model.getStatus());
	}
	
}
