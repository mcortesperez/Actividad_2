package ejercicio_r14;

import java.util.Scanner;

public class Ejercicio_r14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de las ventas del departamento"
				+ " número 1:");
		float ventas_1 = entrada.nextFloat();
		
		System.out.println("Ingrese el valor de las ventas del departamento"
				+ " número 2:");
		float ventas_2 = entrada.nextFloat();
		
		System.out.println("Ingrese el valor de las ventas del departamento"
				+ " número 3:");
		float ventas_3 = entrada.nextFloat();
		
		System.out.println("Ingrese el salario de los vendedores de la empresa: ");
		float salario = entrada.nextFloat();
		
		float ventas_totales = ventas_1 + ventas_2 + ventas_3;
		float p33_ventas = (float)(ventas_totales*0.33);
		
		float salario_1 = salario;
		float salario_2 = salario;
		float salario_3 = salario;
		
		if(ventas_1>p33_ventas) {
			salario_1+= salario*0.2;
		}
		if(ventas_2>p33_ventas) {
			salario_2+= salario*0.2;
		}
		if(ventas_3>p33_ventas) {
			salario_3+= salario*0.2;
		}
		
		System.out.print("Salario vendedores dpto. 1: $"+salario_1+"\n"+
				"Salario vendedores dpto. 1: $"+salario_2+"\n"+
				"Salario vendedores dpto. 1: $"+salario_3);
		
		entrada.close();

	}

}
