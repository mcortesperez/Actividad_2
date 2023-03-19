package ejercicio_r15;

import java.util.Scanner;

public class Ejercicio_r15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peso bola 1 (Kg): ");
		float peso_1 = entrada.nextFloat();
		
		System.out.println("Peso bola 2 (Kg): ");
		float peso_2 = entrada.nextFloat();
		
		System.out.println("Peso bola 3 (Kg): ");
		float peso_3 = entrada.nextFloat();
		
		System.out.println("Peso bola 4 (Kg): ");
		float peso_4 = entrada.nextFloat();
		
		String bola = "";
		String p = "";
		
		if(peso_1 == peso_2 && peso_2 == peso_3) {
			
			bola = "4";
			
			if(peso_4<peso_1) {
				p = "menor";
			}else {
				p = "mayor";
			}
		}
		else if(peso_1 == peso_3 && peso_3 == peso_4) {
			
			bola = "2";
			
			if(peso_2<peso_1) {
				p = "menor";
			}else {
				p = "mayor";
			}
		}
		else if(peso_2 == peso_3 && peso_3 == peso_4) {
			
			bola = "1";
			
			if(peso_1<peso_2) {
				p = "menor";
			}else {
				p = "mayor";
			}
		}
		else{
			bola = "3";
			
			if(peso_3<peso_1) {
				p = "menor";
			}else {
				p = "mayor";
			}
			
		}
		
		System.out.print("La bola de diferente peso es la "+bola
				+ " y su peso es "+p+" que el peso de las otras bolas.");
		
		entrada.close();

	}

}
