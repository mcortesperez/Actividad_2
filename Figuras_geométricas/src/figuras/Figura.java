package figuras;

public class Figura {

	public static void main(String[] args) {
		Circulo fig_1 = new Circulo(4);
		Triangulo fig_2 = new Triangulo(2,4);
		Cuadrado fig_3 = new Cuadrado(1);
		Rectangulo fig_4 = new Rectangulo(2,4);
		Triangulo fig_5 = new Triangulo(3,3);
		
		System.out.println("Área círculo: "+fig_1.Area()+
				" Perímetro círculo: "+fig_1.Perimetro());
		
		System.out.println("Área cuadrado: "+fig_3.Area()+
				" Perímetro cuadrado: "+fig_3.Perimetro());
		
		System.out.println("Área rectángulo: "+fig_4.Area()+
				" Perímetro rectángulo: "+fig_4.Perimetro());
		
		System.out.print("Área triangulo: "+fig_2.Area()
		+", Perímetro triangulo: "+fig_2.Perimetro()
		+", Hipotenusa triangulo: "+fig_2.Hipotenusa()+", ");
		fig_2.TipoTriangulo();
		
		System.out.println("");
		
		System.out.print("Área triangulo: "+fig_5.Area()
		+", Perímetro triangulo: "+fig_5.Perimetro()
		+", Hipotenusa triangulo: "+fig_5.Hipotenusa()+", ");
		fig_5.TipoTriangulo();

	}

}
