package Produto;

public class Programa_Produto {
	public static void main(String[] args) {
		
		Produto produto = new Produto();
		ProdutoView ProdutoView = new ProdutoView();
		
		ProdutoController ProdutoController = new ProdutoController(produto, ProdutoView);
		
		ProdutoController.setProdutoId(1);
		ProdutoController.setNomeProduto("1959 Harley Davidson Ultimate Chopper");
		ProdutoController.setDescricaoProduto("This replica features working kickstand, front suspension, gear-shift lever, footbrake lever, drive chain, wheels and steering. "
				+ "All parts are particularly delicate due to their precise scale and require special care and attention.");
		ProdutoController.setEstoqueProduto(33);
		ProdutoController.setPrecoProduto(20810.00);
		
		ProdutoController.atualizarView();
		
	}
}
