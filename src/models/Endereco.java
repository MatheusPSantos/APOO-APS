package models;

// classe do endereco do usuario

public class Endereco {
	private String rua;
	private String bairro;
	private int numeroCasa;
	
	// metodo construtor
	public Endereco(String rua, String bairro, int numeroCasa) {
		this.rua = rua;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getRua() {
		return this.rua;
	}
	
	public void setBairro(String bairro) {
		this.bairro=bairro;
	}
	public String getBairro() {
		return this.bairro;
	}
	
	public void setNumeroCasa(int numero) {
		this.numeroCasa = numero;
	}
	public int getNumeroCasa() {
		return this.numeroCasa;
	}
}
