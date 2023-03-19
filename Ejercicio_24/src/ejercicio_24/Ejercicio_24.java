package ejercicio_24;

import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peso de la esfera 1: ");
		float peso_1 = entrada.nextFloat();
		
		System.out.println("Peso de la esfera 2: ");
		float peso_2 = entrada.nextFloat();
		
		System.out.println("Peso de la esfera 3: ");
		float peso_3 = entrada.nextFloat();
		
		float mayor = Math.max(peso_1, Math.max(peso_2, peso_3));
		
		if (peso_1 != peso_2 && peso_2 != peso_3 && peso_1 != peso_3) {
			if(mayor == peso_1) {
				System.out.print("La esfera de mayor peso es la numero 1");
			}else if(mayor == peso_2) {
				System.out.print("La esfera de mayor peso es la numero 2");
			}else {
				System.out.print("La esfera de mayor peso es la numero 3");
			}
		}else {
			System.out.print("Las esferas deben ser de diferente peso");
		}
		
		entrada.close();

	}

}
