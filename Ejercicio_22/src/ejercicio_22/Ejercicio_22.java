package ejercicio_22;

import java.util.Scanner;

public class Ejercicio_22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre empleado: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Salario básico por hora: ");
		float salario_hora = entrada.nextFloat();
		
		System.out.println("Horas trabajadas en el mes: ");
		int horas = entrada.nextInt();
		
		float salario_mensual = salario_hora*horas;
		
		if(salario_mensual>450000) {
			System.out.print("Nombre: "+nombre+"\n"
					+ "Salario mensual: $"+salario_mensual);
		}else {
			System.out.print("Nombre: "+nombre);
		}
		
		entrada.close();

	}

}
