package figuras;

public class Circulo {
	
	int radio;
	
	Circulo(int radio){
		this.radio = radio;
	}
	
	float Area() {
		return (float)(Math.PI*Math.pow(radio, 2));
	}
	float Perimetro() {
		return (float)(2*Math.PI*radio);
	}

}
