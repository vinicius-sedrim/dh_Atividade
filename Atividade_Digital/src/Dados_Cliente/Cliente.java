package Dados_Cliente;

public class Cliente {
	private int clienteId;
	private String nome, cpf, rg, email, dataDeNascimento;
	
	public int getclienteId() {
		return clienteId;
	}
	
	public void setclienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataDeNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataDeNascimento = dataNascimento;
	}
	
}
