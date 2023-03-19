package ejercicio_r10;

import java.util.Scanner;

public class Ejercicio_r10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese su número de inscripción: ");
		String numero_ins = entrada.nextLine();
		
		System.out.println("Ingrese su nombre completo: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese su patrimonio: ");
		float patrimonio = entrada.nextFloat();
		
		System.out.println("Ingrese su estrato social: ");
		byte estrato = entrada.nextByte();
		
		float valor_matricula = 50000;
		
		if(patrimonio>2000000 && estrato>3) {
			valor_matricula = (float)(valor_matricula+(valor_matricula*0.03));
		}
		
		System.out.print("El estudiante " +nombre+ " con número de inscripción "+
		numero_ins+ " debe pagar $"+valor_matricula+ " como valor de matricula.");
		
		entrada.close();
	}

}
