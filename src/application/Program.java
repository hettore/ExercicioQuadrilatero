package application;

import entities.Quadrilatero;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Exercício quadrilátero");
		Quadrilatero.area(3);
		System.out.println();
		Quadrilatero.area(5d, 5d);
		System.out.println();
		Quadrilatero.area(7, 8, 9);
		System.out.println();
		Quadrilatero.area(5f, 5f);
	}

	
}
