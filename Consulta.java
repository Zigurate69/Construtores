package Construtores;

public class Consulta {
	
	public int date;
	public String nomePcnte;
	public String nomeDents;
	
	public Consulta(int date, String nomePcnte, String nomeDents) {
		this.date = date;
		this.nomePcnte = nomePcnte;
		this.nomeDents = nomeDents;
	}
	
	public Consulta(int date) {
		this.date = date;
	}
	
	public Consulta(String nomePcnte, String nomeDents) {
		this.nomePcnte = nomePcnte;
		this.nomeDents = nomeDents;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public String getNomePcnte() {
		return nomePcnte;
	}
	
	public void setNomePcnte(String nomePcnte) {
		this.nomePcnte = nomePcnte;
	}
	
	public String getNomeDents() {
		return nomeDents;
	}
	
	public void setNomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}
}