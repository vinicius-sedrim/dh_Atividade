package Produto;

public class ProdutoPedidoView {
	public void imprimeProdutoPedido(int Cliente, int Pedido, String qtdeProduto) {
		System.out.println("Produto/Pedido do Cliente: ");
		System.out.println("\nC�digo do Cliente: " + Cliente);
		System.out.println("C�digo do Pedido: " + Pedido);
		System.out.println("Quantidade de Produtos do Pedido: " + qtdeProduto);
	}
}
