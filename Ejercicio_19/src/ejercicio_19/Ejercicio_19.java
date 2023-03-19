package ejercicio_19;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese la medida del lado del triángulo equilátero"
				+ "del cual desea saber sus propiedades (m): ");
		float lado = entrada.nextFloat();
		
		float perimetro = 3*lado;
		float altura = (float)Math.sqrt(Math.pow(lado, 2)-Math.pow(lado/2, 2));
		float area = (lado*altura)/2;
		
		System.out.print("El triángulo equilátero de lado "+lado+" m. tiene: "
				+ "\nperímetro = "+ perimetro + " m"+
				"\naltura = "+altura+ " m"+
				"\nárea = " +area+ " m²");
		
		entrada.close();
	}

}
