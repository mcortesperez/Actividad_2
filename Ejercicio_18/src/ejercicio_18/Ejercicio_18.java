package ejercicio_18;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_18 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese su nombre completo:");
		String nombres = entrada.nextLine();
		
		System.out.println("Ingrese su código de identificación:");
		int codigo = entrada.nextInt();
		
		System.out.println("¿Cuántas horas trabajó en el mes?:");
		int horas_trabajadas_mes = entrada.nextInt();
		
		
		double valor_hora = 5334;
		float retencion = 0.07F;
		
		double salario_bruto_mes = horas_trabajadas_mes*valor_hora;
		String salario_neto_mes = df.format(salario_bruto_mes-(salario_bruto_mes*retencion));
		
		System.out.print(codigo+" - "+nombres+".\nSu salario bruto del mes es: $"
				+df.format(salario_bruto_mes)+", Su salario neto del mes es: $"+salario_neto_mes);
		
		entrada.close();
	}

}
