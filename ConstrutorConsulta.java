package Construtores;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		
		Consulta consulta1 = new Consulta(15, "Sa" , "Mu");
		Consulta consulta2 = new Consulta(25);
		Consulta consulta3 = new Consulta("Jo" , "Ta");
		
		System.out.println(consulta1.getDate());
		System.out.println(consulta1.getNomePcnte());
		System.out.println(consulta1.getNomeDents());
		
		System.out.println(consulta2.getDate());
		
		System.out.println(consulta3.getNomePcnte());
		System.out.println(consulta3.getNomeDents());
	}
}