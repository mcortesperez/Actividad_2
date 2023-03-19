package ejercicio_r13;

import java.util.Scanner;

public class Ejercicio_r13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor total de la compra: ");
		float valor_compra = entrada.nextFloat();
		
		entrada.nextLine();
		
		System.out.println("Cuál fue el color de la bolita que sacó?"
				+ "(blanca,verde,amarilla,azul,roja)");
		String bolita = entrada.nextLine();
		
		bolita = bolita.toLowerCase();
		
		if(bolita.equals("verde")) {
			valor_compra = (float)(valor_compra-(valor_compra*0.1));
		}
		else if(bolita.equals("amarilla")) {
			valor_compra = (float)(valor_compra-(valor_compra*0.25));
		}
		else if(bolita.equals("azul")) {
			valor_compra = (float)(valor_compra-(valor_compra*0.5));
		}
		else if(bolita.equals("roja")) {
			valor_compra = 0;
		}
		
		System.out.print("El cliente debe pagar: $"+valor_compra);
		
		entrada.close();

	}

}
