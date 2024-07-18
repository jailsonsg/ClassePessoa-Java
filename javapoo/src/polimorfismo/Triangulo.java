package polimorfismo;

public class Triangulo extends FormasGeometricas {
	// sobrescrita do metodo area
	public void area(double base, double altura) {
		System.out.println((base*altura)/2);
	}
	
	public void perimetro(double lado1, double lado2, double lado3) {
		System.out.println(lado1 + lado2 + lado3);
	}
	// sobrecarga - dois metodos com mesmo nome em uma classe, com assinaturas diferentes.
	public void perimetro(double lado1) {
		System.out.println(lado1 * 3);
	}
}
