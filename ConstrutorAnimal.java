package Construtores;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal(30, "Branco");
		Animal animal2 = new Animal(20);
		Animal animal3 = new Animal("Preto");
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		
		System.out.println(animal2.getTamanho());
		
		System.out.println(animal3.getCor());
	}
} 