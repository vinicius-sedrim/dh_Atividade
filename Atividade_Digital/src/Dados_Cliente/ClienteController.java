package Dados_Cliente;

public class ClienteController {
	
	private Cliente model;
	private ClienteView view;
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setIdCliente(int id_cliente) {
		model.setclienteId(id_cliente);
	}
	
	public int getIdCliente() {
		return model.getclienteId();
	}
	
	public void setNome(String nome) {
		model.setNome(nome);
	}
	
	public String getNome() {
		return model.getNome();
	}
	
	public void setCpf(String cpf) {
		model.setCpf(cpf);
	}
	
	public String getCpf() {
		return model.getCpf();
	}
	
	public void setRg(String rg) {
		model.setRg(rg);
	}
	
	public String getRg() {
		return model.getRg();
	}
	
	public void setDataNascimento(String dataNascimento) {
		model.setDataNascimento(dataNascimento);
	}
	
	public String getDataNascimento() {
		return model.getDataNascimento();
	}
	
	public void setEmail(String email) {
		model.setEmail(email);
	}
	
	public String getEmail() {
		return model.getEmail();
	}
	
	public void atualizarView() {
		view.imprimeDetalhesDoCliente(model.getclienteId(),
		model.getNome(), model.getCpf(), model.getRg(),
		model.getDataNascimento(), model.getEmail());
	}
}
