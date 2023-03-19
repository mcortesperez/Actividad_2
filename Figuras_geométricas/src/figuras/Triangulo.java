package figuras;

public class Triangulo {
	
	int base;
	int altura;
	
	Triangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	float Area() {
		return (base*altura)/2;
	}
	float Hipotenusa() {
		return (float)Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
	}
	float Perimetro() {
		return base + altura + Hipotenusa();
	}
	void TipoTriangulo() {
		if (base == altura) {
			System.out.print("El triángulo es isóceles");
		}else {
			System.out.print("El triángulo es escaleno");
		}
	/* Note que para que el ejercicio tenga sentido debe ser construido un triángulo
	 * rectángulo, un triángulo rectángulo no podrá ser equilátero bajo ninguna 
	 * circunstancia, la hipotenusa no podrá ser igual a ninguno de los catetos. Por
	 * lo tanto, sólo existe la posibilidad de ser isóceles(base = altura) o escaleno.
	 */
	}

}
