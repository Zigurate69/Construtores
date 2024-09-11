package Construtores;

public class Animal {
	
	private int tamanho;
	private String cor;
	
	public Animal(int tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public Animal(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public Animal(String cor) {
		this.cor = cor;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
}