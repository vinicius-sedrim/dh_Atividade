package Dados_Cliente;

public class ClienteView {
	
	public void imprimeDetalhesDoCliente(int clienteId, String nome, String cpf, String rg, String dataDeNascimento, String email) {
		
		System.out.println("Id: " + clienteId);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("Data de Nascimento: " + dataDeNascimento);
		System.out.println("Email: " + email);
	}

}

