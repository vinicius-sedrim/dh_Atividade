package Pedido;

public class PedidoView {
	public void imprimePedido(int Cliente, int notaFiscal, String Emissao, double Total, String status) {
		System.out.println("Pedido do Cliente: ");
		System.out.println("\nC�digo do Cliente: " + Cliente);
		System.out.println("Nota Fiscal n�: " + notaFiscal);
		System.out.println("Data de emiss�o: " + Emissao);
		System.out.println("Valor total do pedido: " + Total);
		System.out.println("Status do pedido: " + status);
		
}
	
}
