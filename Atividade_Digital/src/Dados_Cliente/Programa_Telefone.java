package Dados_Cliente;

public class Programa_Telefone {
	public static void main(String[] args) {
		
		Telefone telefone = new Telefone();
		TelefoneView TelefoneView = new TelefoneView();
		
		TelefoneController TelefoneController = new TelefoneController(telefone, TelefoneView);
		
		TelefoneController.setFkCliente(1);
		TelefoneController.setDddTelefone(11);
		TelefoneController.setNumeroTelefone("9 9845-7125");
		
		TelefoneController.atualizarView();
	}
}
