package application;

import entities.Quadrilatero;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Exercício quadrilátero");
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);
		System.out.println();
		double areaRetangulo = Quadrilatero.area(5d, 5d);
		System.out.println("Área do retângulo: " + areaRetangulo);
		System.out.println();
		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("Área do trapézio: " + areaTrapezio);
		System.out.println();
		double areaLosango = Quadrilatero.area(5f, 5f);
		System.out.println("Área do losango: " + areaLosango);
	}

	
}
