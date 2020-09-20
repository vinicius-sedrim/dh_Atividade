package Pedido;

public class Programa_Pedido {
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		PedidoView PedidoView = new PedidoView();
		
		PedidoController PedidoController = new PedidoController(pedido, PedidoView);
		
		PedidoController.setFkCliente(1);
		PedidoController.setNotaFiscal(123456789);
		PedidoController.setDataEmissao("15-07-2010");
		PedidoController.setValorTotal(3010.00);
		PedidoController.setStatusPedido("Entregue");
		PedidoController.atualizarView();
	}
}
