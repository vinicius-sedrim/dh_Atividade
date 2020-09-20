package Dados_Cliente;

public class Programa_Cliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ClienteView ClienteView = new ClienteView();
		
		ClienteController ClienteController = new ClienteController(cliente, ClienteView);
		
		ClienteController.setIdCliente(2);
		ClienteController.setNome("Felipe Martins");
		ClienteController.setCpf("695.256.644-02");
		ClienteController.setRg("56.223.884-22");
		ClienteController.setDataNascimento("05/03/1995");
		ClienteController.setEmail("fmartins@hotmail.com");
			
		ClienteController.atualizarView();
	}
}
