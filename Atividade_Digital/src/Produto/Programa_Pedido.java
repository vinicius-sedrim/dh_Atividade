package Produto;

public class Programa_Pedido {
	public static void main(String[] args) {
		
		ProdutoPedido produtoPedido = new ProdutoPedido();
		ProdutoPedidoView ProdutoPedidoView = new ProdutoPedidoView();
		
		ProdutoPedidoController ProdutoPedidoController = new ProdutoPedidoController(produtoPedido, ProdutoPedidoView);
		
		ProdutoPedidoController.setFkCliente(1);
		ProdutoPedidoController.setfkPedido(2020045001);
		ProdutoPedidoController.setQtdeProduto("1");
		
		ProdutoPedidoController.atualizarView();
		
	}
}
