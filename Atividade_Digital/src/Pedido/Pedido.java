package Pedido;

public class Pedido {
	private int Cliente, notaFiscal;
	private String emissao, status;
	private double total;
	
	public int getCliente() {
		return Cliente;
	}
	
	public void setCliente(int Cliente) {
		this.Cliente = Cliente;
	}
	
	public int getNotaFiscal() {
		return notaFiscal;
	}
	
	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	public String getEmissao() {
		return emissao;
	}
	
	public void setEmissao(String Emissao) {
		this.emissao = Emissao;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double Total) {
		this.total = Total;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
