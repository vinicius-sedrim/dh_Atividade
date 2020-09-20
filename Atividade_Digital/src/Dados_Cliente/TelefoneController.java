package Dados_Cliente;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setFkCliente(int fkCliente) {
		model.setCliente(fkCliente);
	}
	
	public int getFkCliente() {
		return model.getCliente();
	}
	
	public void setDddTelefone(int dddTelefone) {
		model.setDddTelefone(dddTelefone);
	}
	
	public int getDddTelefone() {
		return model.getDddTelefone();
	}
	
	public void setNumeroTelefone(String Telefone) {
		model.setTelefone(Telefone);
	}
	
	public String getNumeroTelefone() {
		return model.getTelefone();
	}
	
	public void atualizarView() {
		view.imprimeTelefone(model.getCliente(), 
		model.getDddTelefone(), model.getTelefone());
	}
}
