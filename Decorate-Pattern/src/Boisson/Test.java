package Boisson;

import Decorator.Caramel;
import Decorator.Chocolat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boisson b = new Espresso();
		System.out.println("**************************");
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		System.out.println("**************************");
		b = new Chocolat(b);
		System.out.println("**************************");
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		System.out.println("**************************");
		b = new Caramel(b);
		System.out.println("**************************");
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		System.out.println("**************************");
		b = new Chocolat(b);
		System.out.println("**************************");
		System.out.println(b.getDescription());
		System.out.println(b.cout());
		System.out.println("**************************");


	}

}
