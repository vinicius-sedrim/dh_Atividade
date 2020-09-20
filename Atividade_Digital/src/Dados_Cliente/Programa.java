package Dados_Cliente;

public class Programa {
	public static void main(String[] args) {
		
		Endereco Endereco = new Endereco();
		EnderecoView EnderecoView = new EnderecoView();
		
		EnderecoController EnderecoController = new EnderecoController(Endereco, EnderecoView);
		
		EnderecoController.setCliente(1);
		EnderecoController.setRua("Avenida Paulista");
		EnderecoController.setNumero("1227");
		EnderecoController.setBairro("Bela Vista");
		EnderecoController.setCidade("São Paulo");
		EnderecoController.setEstado("São Paulo");
		
		EnderecoController.viewAtualizar();
	}
}
