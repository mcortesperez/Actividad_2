package ejercicio_r12;

import java.util.Scanner;

public class Ejercicio_r12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre completo: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese el número de horas trabajadas en la semana: ");
		int horas = entrada.nextInt();
		
		System.out.println("Ingrese el valor al que se le paga la hora: ");
		float valor_hora = entrada.nextFloat();
		
		float pago = 0;
		
		if (horas<=40) {
			pago = horas*valor_hora;
		}
		else if (40<horas && horas<=48) {
			pago = (40*valor_hora)+((horas-40)*(valor_hora*2));
		}
		else {
			pago = (40*valor_hora)+(16*valor_hora)+((horas-48)*valor_hora*3);
		}
		
		System.out.print("El trabajador "+nombre+ " devengó: $" +pago);
		
		entrada.close();

	}

}
