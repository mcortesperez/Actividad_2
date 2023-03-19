package figuras;

public class Cuadrado {
	
	int lado;
	
	Cuadrado(int lado){
		this.lado = lado;
	}
	
	float Area(){
		return lado*lado;
	}
	
	float Perimetro() {
		return 4*lado;
	}

}
