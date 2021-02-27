package LD;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingeniero i = new Ingeniero("pedro");
		Deportista d = new Deportista("gema");

		System.out.println(i.correr());
		System.out.println(d.correr());

	}

}
