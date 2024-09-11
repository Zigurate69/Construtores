package Construtores;

public class ConstrutorCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("ABC1D23", 23);
		Carro carro2 = new Carro("ASD9F87");
		Carro carro3 = new Carro(25);
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumChassi());
		
		System.out.println(carro2.getPlaca());
		
		System.out.println(carro3.getNumChassi());
	}
}