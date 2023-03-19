package ejercicio_r11;

import java.util.Scanner;

public class Ejercicio_r11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese el valor del primer número: ");
		float a = entrada.nextFloat();
		
		System.out.println("Ingrese el valor del segundo número: ");
		float b = entrada.nextFloat();
		
		System.out.println("Ingrese el valor del tercer número: ");
		float c = entrada.nextFloat();
		
		float mayor = 0;
		
		if(a>b && a>c) {
			mayor = a;
		}
		else if(b>a && b>c){
			mayor = b;
		}
		else {
			mayor = c;
		}
		
		/*mayor = Math.max(a,Math.max(b,c))			Forma alternativa para evitar 
													los condicionales anteriores.*/
		
		System.out.print("El número mayor es: " +mayor);
		
		entrada.close();

	}

}
