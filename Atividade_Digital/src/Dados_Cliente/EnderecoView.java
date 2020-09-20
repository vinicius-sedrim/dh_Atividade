package Dados_Cliente;

public class EnderecoView {
	
	public void imprimeEndereco(int Cliente, String rua, String numero, String bairro, String cidade, String estado) {
		System.out.println("Endereço: ");
		System.out.println("\nCódigo do Cliente: " + Cliente);
		System.out.print("Rua: " + rua);
		System.out.print("," + numero);
		System.out.println(" " + bairro);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
	}
}
