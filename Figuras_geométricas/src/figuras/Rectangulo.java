package figuras;

public class Rectangulo {
	
	int base;
	int altura;
	
	Rectangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	float Area() {
		return base*altura;
	}
	
	float Perimetro() {
		return 2*(base+altura);
	}

}
