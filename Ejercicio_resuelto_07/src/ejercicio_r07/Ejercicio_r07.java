package ejercicio_r07;

import java.util.Scanner;

public class Ejercicio_r07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese el valor del número A: ");
		float a = entrada.nextFloat();
		
		System.out.println("Ingrese el valor del número B: ");
		float b = entrada.nextFloat();
		
		if (a>b){
			System.out.print("A es mayor que B");
		}
		else if(a==b) {
			System.out.print("A es igual a B");
		}
		else {
			System.out.print("A es menor que B");
		}
		
		entrada.close();

	}

}
