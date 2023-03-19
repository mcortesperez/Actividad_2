package ejercicio_23;

import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa para calcular las posibles soluciones"
				+ "de una ecuación cuadrática");
		System.out.println("Ingrese el valor de A: ");
		float a = entrada.nextFloat();
		
		System.out.println("Ingrese el valor de B: ");
		float b = entrada.nextFloat();
		
		System.out.println("Ingrese el valor de C: ");
		float c = entrada.nextFloat();
		
		if(Math.pow(b, 2)-4*a*c >= 0 && a!=0) {
			
			float sol1 = (float)(((-1*b)+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
			float sol2 = (float)(((-1*b)-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
			System.out.print("Las posibles soluciones de la ecuación cuadrática son: "
					+sol1+ " y " +sol2);
		}else {
			System.out.print("La ecuación ingresada no tiene soluciones reales");
		}
		
		entrada.close();

	}

}
