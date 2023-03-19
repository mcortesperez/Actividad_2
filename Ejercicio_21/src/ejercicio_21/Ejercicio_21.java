package ejercicio_21;

import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese en unidades de centímetros la medida de los tres\n"
				+ "lados del triángulo del cual quiere saber sus propiedades: \n");
		System.out.println("Lado 1: ");
		float lado_1 = entrada.nextFloat();
		System.out.println("Lado 2: ");
		float lado_2 = entrada.nextFloat();
		System.out.println("Lado 3: ");
		float lado_3 = entrada.nextFloat();
		
		float perimetro = lado_1 + lado_2 + lado_3;
		float semiperimetro = perimetro/2;
		float area = (float)(Math.sqrt(Math.pow(lado_1, 2)-Math.pow(lado_2/2, 2))*lado_2)/2;
		
		System.out.print("El triángulo de medidas ingresadas tiene: \n"
				+ "perímetro = "+perimetro+ " cm"+
				"\nsemiperímetro = "+semiperimetro+ " cm"+
				"\nárea = "+area+ " cm²");
		
		entrada.close();
	}

}
