package Construtores;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Jose", 20);
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa("Joao");
		Pessoa pessoa4 = new Pessoa(26);
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		
		pessoa2.setIdade(18);
		pessoa2.setNome("Ana Julia");
		
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getNome());
		
		System.out.println(pessoa3.getNome());
		
		System.out.println(pessoa4.getIdade());
	}
}