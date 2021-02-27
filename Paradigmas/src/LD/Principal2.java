package LD;

public class Principal2 {
	public static void main(String[] args) {

		Persona i = new Ingeniero("pedro");
		Persona d = new Deportista("gema");
		System.out.println(i.correr());
		System.out.println(d.correr());

	}
}
